package Lesson_07;

public abstract class Benchmark {
    // An abstract class. Example from the Arnold/Gosling manual

    public Benchmark(int k) {
        System.out.println(k);
    }

    abstract void action (); // Abstract method

    public long runTime (int n) { // Concrete method
        // Computes the run time of n calls to action()

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            action();
        return(System.currentTimeMillis() - start);
    }
}
