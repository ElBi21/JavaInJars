package Lesson_13;
import Lesson_03.EmptyStackException;
import Lesson_03.FullStackException;

public class Lesson13_Main {
    public static void main(String[] args) throws EmptyStackException, InterruptedException, FullStackException {
        System.out.println("------- Starting Messy Threads Test -------");
        AThreadMess.TestMess();

        System.out.println("------- Starting Printers Test -------");
        TestPrinter.TestForPrinters();

        System.out.println("------- Starting Printers Test -------");
        DeadLock.TestDeadLock();
    }
}