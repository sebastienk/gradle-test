package be.cocom.dms.packageb;


import be.cocom.dms.packagea.TestConstantA;

public class TestConstantB {

    public static String oneStaticSource = "I'm an static source from B";
    public static String oneStaticSourceFromA = TestConstantA.oneStaticSource;
}
