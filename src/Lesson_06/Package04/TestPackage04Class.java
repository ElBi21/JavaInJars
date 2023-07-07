package Lesson_06.Package04;

public class TestPackage04Class {
    public static void TestPackage04 () {
        // Creates two IntVars and compares them

        IntegerVar v1 = new IntegerVar_01();
        // v1.extraJunk(); // no way!

        IntegerVar v2 = new IntegerVar_02();

        if (cmpVars(v1, v2)) {
            System.out.println("Value1 and Value2 are equal. Can't distinguish them!");
        }
    }

    public static boolean cmpVars(IntegerVar x, IntegerVar y) {
        // Runs a simple comparison test on int vars
        x.assign(7);
        y.assign(7);
        return x.get() == y.get();
    }
}
