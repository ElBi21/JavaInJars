package Lesson_06.Package04;

public class TestPackage04Class {
    public static void TestPackage04 () {
        // Creates two IntVars and compares them

        IntegerVar v1 = new IntegerVar_01();
        // Similarly to what we said in Lesson 05 regarding subclasses, v1 is of type IntegerVar, so the interface, not
        // the implementing class. This means that we can't use the extraJunk() method. We could've used it if there was
        // an extraJunk() method also in the IntegerVar interface
        // WRE: v1.extraJunk(); // No way!

        IntegerVar v2 = new IntegerVar_02();

        if (compareVars(v1, v2)) {
            System.out.println("Value1 and Value2 are equal. Can't distinguish them!");
        }
    }

    public static boolean compareVars(IntegerVar x, IntegerVar y) {
        // Runs a simple comparison test on int vars
        x.assign(7);
        y.assign(7);
        return x.get() == y.get();
    }
}
