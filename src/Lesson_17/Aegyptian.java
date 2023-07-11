package Lesson_17;

/** Computing product Aegyptian style */
public class Aegyptian {
    public static void TestAegyptian() {
        int a = 172;
        int b = 37;
        // int b = -37;

        int x = a, y = b, res = 0;

        assert (y >= 0 && (x * y + res == a * b)):
                "Invariant = " + (y >= 0 && x * y + res == a * b);

        while (y >= 1) {
            if (y % 2 == 0) {
                x = x + x;
                y = y/2;
            }
            else {
                res = res + x;
                y = y - 1;
            }
            assert (y >= 0 && x * y + res == a * b); // loop invariant
        }

        assert (res == a * b): "Without this: 172 * -37 = 0!";
        System.out.println(a + " * " + b + " = " + res);

        // /*
        try {
            assert false;
        }
        catch (AssertionError e) {
            System.out.println("false!!!");
        }
        // */
    }
}