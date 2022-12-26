package be.cocom.dms.packagec;

import be.cocom.dms.packageb.TestConstantB;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassCTest {

    private String myClassBVariable;

    private ClassC classC;

    @Test
    void testAccessToClassATestClass() {
        myClassBVariable = TestConstantB.oneStaticSourceFromA;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from A");
    }

}