# CDWriterJava

This is a clone of https://github.com/kohsuke/com4j/downloads/com4j-20120426-2.zip

tlbimp-2.2-SNAPSHOT.jar
com4j-2.2-SNAPSHOT.jar
both rebuilt from the main branch of https://github.com/kohsuke/com4j

To pick up the executable from the win64 property of the win32 property is not present.

TypeLibInfo.java tweaked to ...

    try {
        fileName = Native.readRegKey(verKey+"\\"+lcid+"\\win32");
    } catch( ComException e ) {
        System.out.println("Warning no win32 key found - trying win64 key");
        try {
            fileName = Native.readRegKey(verKey + "\\" + lcid + "\\win64");
        } catch ( ComException e2 ) {
            throw new BindingException(Messages.NO_WIN32_TYPELIB.format(libid,version),e2);
        }
    }

Jars rebuilt with the install build target.