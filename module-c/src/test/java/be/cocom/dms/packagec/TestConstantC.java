package be.cocom.dms.packagec;

import be.cocom.dms.packagea.TestConstantA;
import be.cocom.dms.packageb.TestConstantB;

public class TestConstantC {

    public static String oneStaticSource = "I'm an static source from C";

    public static String oneStaticSourceFromA = TestConstantA.oneStaticSource;
    public static String oneStaticSourceFromB = TestConstantB.oneStaticSource;
}
