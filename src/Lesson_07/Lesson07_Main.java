package Lesson_07;

public class Lesson07_Main {
    public static void main(String[] args) {
        System.out.println("------- Starting Abstract Class Test -------");
        TestBenchmark(args);

        System.out.println("------- Starting Static Fields Test -------");
        TestChildren();
    }

    public static void TestBenchmark (String[] args) {
        // Uses as input an int (testNumber) from args[0]. The class will execute a method for testNumber times, while
        // also counting the runTime

        int testNumber = Integer.parseInt(args[0]);

        // WRE: Benchmark b = new Benchmark(); // Not possible, we cannot create objects of an abstract class!
        long t = new ConcreteBenchmark().runTime(testNumber);
        // long is a primitive type that represents a 64-bit wide number

        // note: runTime is inherited from the abstract class, while action() is implemented by the concrete.
        // We can use runTime because it's a concrete method in Benchmark, and also because ConcreteBenchmark extends
        // Benchmark, inheriting the runTime() method
        System.out.println(testNumber + " actions in " + t + " milliseconds");
    }

    public static void TestChildren () {
        // plays with children

        Children eve = new Children("Mark");
        Children adam = new Children("Dan");

        eve.whoAmI();
        adam.whoAmI();
        new Children("Elias").whoAmI();
    }
}
