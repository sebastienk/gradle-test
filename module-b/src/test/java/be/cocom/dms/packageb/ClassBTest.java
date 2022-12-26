package be.cocom.dms.packageb;

import be.cocom.dms.packagea.ClassA;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassBTest {

    private String myClassBVariable;

    private ClassA classA;

    @Test
    void testAccessToClassATestClass() {
        myClassBVariable = TestConstantB.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from A");
    }

}