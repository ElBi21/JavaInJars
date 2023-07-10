package Lesson_13;

public class TestPrinter {
    public static void TestForPrinters() {
        NamedThread thread1 = new NamedThread("Thread1");
        NamedThread thread2 = new NamedThread("Thread2");
        thread1.start();
        thread2.start();
    }
}