package imapi2fs  ;

import com4j.*;
import imapi2common.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * Boot options
   */
  public static imapi2fs.IBootOptions createBootOptions() {
    return COM4J.createInstance( imapi2fs.IBootOptions.class, "{2C941FCE-975B-59BE-A960-9A2A262853A5}" );
  }

  /**
   * File system image
   */
  public static imapi2fs.IFileSystemImage3 createMsftFileSystemImage() {
    return COM4J.createInstance( imapi2fs.IFileSystemImage3.class, "{2C941FC5-975B-59BE-A960-9A2A262853A5}" );
  }

  /**
   * Microsoft IMAPIv2 Iso Image Manager
   */
  public static imapi2fs.IIsoImageManager createMsftIsoImageManager() {
    return COM4J.createInstance( imapi2fs.IIsoImageManager.class, "{CEEE3B62-8F56-4056-869B-EF16917E3EFC}" );
  }
}
