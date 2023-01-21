package be.cocom.dms.packagec;

import be.cocom.dms.packagea.TestConstantA;
import be.cocom.dms.packageb.ClassB;
import be.cocom.dms.packageb.TestConstantB;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassCTest {

    private String myClassBVariable;

    private ClassB classB;

    @Test
    void testAccessToClassATestClass() {
        myClassBVariable = TestConstantA.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from A");
    }

    @Test
    void testAccessToClassBTestClass() {
        myClassBVariable = TestConstantB.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from B");
    }

    @Test
    void testAccessToClassCTestClass() {
        myClassBVariable = TestConstantC.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from C");
    }

    @Test
    void testAccessToClassAFromClassBTestClass() {
        myClassBVariable = TestConstantC.oneStaticSourceFromA;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from A");
    }

}