package org.kie.package1;

import org.kie.annotations.TestAnnotation;
import org.kie.annotations.TestAnnotation1;
import org.kie.annotations.TestAnnotation2;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(ed3a8f08df9a719b077497bbf0d7b26f)
 */

@TestAnnotation
@TestAnnotation1(value = "value")
@org.kie.api.definition.type.Description(value = " AnnotatedPojo1 description")
@TestAnnotation2(method1 = "param1", method2 = "param2")
@org.kie.api.definition.type.Label(value = "AnnotatedPojo1Label")
public class AnnotatedPojo1 implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public AnnotatedPojo1() {
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

    public static String method3() { return null; }

    public static final Integer method4() { return null; }

}