package Lesson_17;

public class Lesson17_Main {
    public static void main(String[] args) {
        System.out.println("------- Starting Assertion Test -------");
        Aegyptian.TestAegyptian();

        testAssert();
    }

    public static void testAssert() {
        int x = 4;
        int y = 16;
        int res;

        int a = x, b = y;
        res = a + b;

        assert (res >= 0 && a * b < - (a - b) * 2):
                "Assertion failed";
    }
}
