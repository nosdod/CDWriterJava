package excel  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static excel._QueryTable createQueryTable() {
    return COM4J.createInstance( excel._QueryTable.class, "{59191DA1-EA47-11CE-A51F-00AA0061507F}" );
  }

  public static excel._Application createApplication() {
    return COM4J.createInstance( excel._Application.class, "{00024500-0000-0000-C000-000000000046}" );
  }

  public static excel._Chart createChart() {
    return COM4J.createInstance( excel._Chart.class, "{00020821-0000-0000-C000-000000000046}" );
  }

  public static excel._Worksheet createWorksheet() {
    return COM4J.createInstance( excel._Worksheet.class, "{00020820-0000-0000-C000-000000000046}" );
  }

  public static excel._Global createGlobal() {
    return COM4J.createInstance( excel._Global.class, "{00020812-0000-0000-C000-000000000046}" );
  }

  public static excel._Workbook createWorkbook() {
    return COM4J.createInstance( excel._Workbook.class, "{00020819-0000-0000-C000-000000000046}" );
  }

  public static excel._OLEObject createOLEObject() {
    return COM4J.createInstance( excel._OLEObject.class, "{00020818-0000-0000-C000-000000000046}" );
  }
}
