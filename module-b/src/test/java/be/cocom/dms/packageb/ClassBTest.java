package be.cocom.dms.packageb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassBTest {

    private String myClassBVariable;

    @Test
    void testAccessToClassATestClass() {
        myClassBVariable = TestConstant.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("OK");
    }

}