package Lesson_07;

public class ConcreteBenchmark extends Benchmark{
    public ConcreteBenchmark () {
        super(88);
    }

    public void action() { // tics
        System.out.println("Acting...");
        for (int i = 0; i<10000; i++) {
            pass();
        }
    }

    public void pass () {

    }
}
