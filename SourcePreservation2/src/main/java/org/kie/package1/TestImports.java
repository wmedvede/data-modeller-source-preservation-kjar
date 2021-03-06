package org.kie.package1;

//imports to jdk packages
import java.math.*;
import java.util.*;
import java.text.MessageFormat;


//imports to kie-api packages
import org.kie.api.definition.type.Key;
import org.kie.api.definition.type.*;

//imports to classes and packages in this project
import org.kie.package2.*;
import org.kie.package3.Pojo3;

//import to other project dependencies or classes
import javax.persistence.*;


/**
 * This class was automatically generated by the data modeler tool.
 */
public class TestImports implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public TestImports() {
    }

    public class Inner1 {

        //buy now we are skipping inner clases
        private int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    };

    private int method1() { return -1; }

    private void method2() {}

    public static java.lang.String method3() { return null; }

    public static final Integer method4() { return null; }

    @Key
    String stringField;

    @Label("bigDecimalField Label")
    BigDecimal bigDecimalField;

    Date dateField;

    @Key
    Pojo2 p2;

    @Description("La descripcion del pojo3")
    Pojo3 p3;

    @Id
    long idField;

    public Pojo1 p1;

    MessageFormat message;

}
