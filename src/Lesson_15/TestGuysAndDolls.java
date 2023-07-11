package Lesson_15;

/** Creates and starts two guys and two dolls. End of the ball after 100 milliseconds. */
public class TestGuysAndDolls {
    public static void TestTheGuysAndTheDolls() throws InterruptedException {
        Doll D1 = new Doll("Vivian");
        Doll D2 = new Doll("Jean");

        D1.start();
        D2.start();

        Guy G1 = new Guy("Frank");
        Guy G2 = new Guy("Marlon");
        // Guy G3 = new Guy("Qui");
        // Guy G4 = new Guy("Quo");
        // Guy G5 = new Guy("Qua");

        G1.start();
        G2.start();
        // G3.start();
        // G4.start();
        // G5.start();

        Thread.currentThread().sleep(100);
        G1.interrupt();
        G2.interrupt();
        D1.interrupt();
        D2.interrupt();
    }
}