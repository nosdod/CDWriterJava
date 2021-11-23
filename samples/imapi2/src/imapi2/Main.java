package imapi2;

import com4j.Com4jObject;
import imapi2.*;
import imapi2fs.*;
import java.lang.reflect.Method;
import java.lang.Object;

/**
 * Uses Microsoft IMAPIv2 Library to access writeable drives.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Connecting to IMAPI2");
        IDiscMaster2 recorderList = imapi2.ClassFactory.createMsftDiscMaster2();
        System.out.println("Found " + recorderList.getCount() + " Recorders");

        IDiscRecorder2 recorder = imapi2.ClassFactory.createMsftDiscRecorder2();
        // Initialise connection
        recorder.initializeDiscRecorder(recorderList.getItem(0));

        System.out.println("VendorId = " + recorder.getVendorId());
        System.out.println("ProductId = " + recorder.getProductId());
        System.out.println("Product revision = " + recorder.getProductRevision());
        System.out.println("Volume Name = " + recorder.getVolumeName());
        System.out.println("Device can load media = " + recorder.getDeviceCanLoadMedia());
        System.out.println("legacy Device no. = " + recorder.getLegacyDeviceNumber());

        java.lang.Object pathStrs = recorder.getVolumePathNames();

        // Doesn't work - get an unexpected type conversion error ...
        //System.out.println("Volume Path Names = " + pathStrs[0]);

        // Open the disc tray ... Works!
        // recorder.ejectMedia();

        IDiscFormat2Data formatter = imapi2.ClassFactory.createMsftDiscFormat2Data();
        formatter.setRecorder( recorder );
        formatter.setClientName( "JavaCDWriter");
        formatter.setForceMediaToBeClosed( false );
        try {
            System.out.println("Free sectors on media = " + formatter.getFreeSectorsOnMedia());
        } catch ( Exception e ) {
            System.out.println( "Free sectors on media = Not available");
        }
        try {
            System.out.println("Total sectors on media = " + formatter.getTotalSectorsOnMedia());
        } catch ( Exception e ) {
            System.out.println( "Total sectors on media = Not available");
        }
        System.out.println("Current Physical Media Type = " + formatter.getCurrentPhysicalMediaType());

        // Current media status is a set of flags
        // Generated code is not handling it correctly!
        // IMAPI_FORMAT2_DATA_MEDIA_STATE holds values which can be used to identify the flag bits
        // but additional logic is needed somewhere to do the extraction.
        // The powershell interface has additional properties/methods to support in this area
        // e.g. IsCurrentMediaSupported() and MediaHeuristicallyBlank()
        // Not sure what the required code would look like, but doesn't feel that complicated.
        int mediaStatus = formatter.getCurrentMediaStatus();

        int INFORMATIONAL_MASK = 15;
        int OVERWRITE_ONLY = 1;
        int BLANK = 2;
        int APPENDABLE = 4;
        int FINAL_SESSION = 8;

        int STATUS_MASK = 0xFC00;
        int DAMAGED = 1024;
        int ERASE_REQUIRED = 2048;
        int NON_EMPTY_SESSION = 4096;
        int WRITE_PROTECT = 8192;
        int FINALIZED = 16384;

        int informational = mediaStatus & INFORMATIONAL_MASK;
        boolean isOverWriteOnly = false;
        if ( (informational & OVERWRITE_ONLY) > 0 ) isOverWriteOnly = true;
        boolean isBlank = false;
        if ( (informational & BLANK) > 0 ) isBlank = true;
        boolean isAppendable = false;
        if ( (informational & APPENDABLE) > 0 ) isAppendable = true;
        boolean isFinalSession = false;
        if ( (informational & FINAL_SESSION) > 0 ) isFinalSession = true;
        System.out.println("Current media status = isOverWriteOnly " + isOverWriteOnly);
        System.out.println("Current media status = isBlank " + isBlank);
        System.out.println("Current media status = isAppendable " + isAppendable);
        System.out.println("Current media status = isFinalSession " + isFinalSession);

        int status = mediaStatus & STATUS_MASK;
        boolean isDamaged = false;
        if ( (status & DAMAGED) > 0 ) isDamaged = true;
        boolean isEraseRequired = false;
        if ( (status & ERASE_REQUIRED) > 0 ) isEraseRequired = true;
        boolean isNonEmptySession = false;
        if ( (status & NON_EMPTY_SESSION) > 0 ) isNonEmptySession = true;
        boolean isFinalized = false;
        if ( (status & FINALIZED) > 0 ) isFinalized = true;

        System.out.println("Current media status = isDamaged " + isDamaged );
        System.out.println("Current media status = isEraseRequired " + isEraseRequired );
        System.out.println("Current media status = isNonEmptySession " + isNonEmptySession );
        System.out.println("Current media status = isFinalized " + isFinalized );
        System.out.println("Current Write protect status = " + formatter.getWriteProtectStatus());

        // Steps to write to media
        String action = "Status";
        if ( action == "Write" ) {
            IFileSystemImage fs = imapi2fs.ClassFactory.createMsftFileSystemImage();
            fs.setVolumeName("SomeEntropy112021");
            fs.setFileSystemsToCreate(FsiFileSystems.FsiFileSystemUDF);
            IFsiDirectoryItem fsRoot = fs.getRoot();
            System.out.println("INFO : About to copy source files to in memory file system ...");
            fsRoot.addTree("C:/UploadDir", false);
            System.out.println("INFO : Creating file system image ...");
            IFileSystemImageResult image = fs.createResultImage();
            System.out.println("INFO : Now writing file system image to media ...");
            try {
                formatter.write(image.getImageStream());
                System.out.println("INFO : Write to media complete.");
            } catch (Exception e) {
                System.out.println("ERROR : Write is not possible to this disc");
            }
        } else if ( action == "Erase" ) {
            IDiscFormat2Erase eraser = imapi2.ClassFactory.createMsftDiscFormat2Erase();
            eraser.setRecorder( recorder );
            eraser.setClientName( "JavaCDWriter");
            System.out.println("INFO : Now erasing media ...");
            eraser.eraseMedia();
            System.out.println("INFO : Erasing complete.");
        }
    }
}
