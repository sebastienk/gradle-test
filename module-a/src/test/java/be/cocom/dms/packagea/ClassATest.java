package be.cocom.dms.packagea;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassATest {

    @Test
    void letString() {
        String myClassBVariable = TestConstant.oneStaticSource;
        Assertions.assertThat(myClassBVariable).isEqualTo("I'm an static source from A");
    }
}