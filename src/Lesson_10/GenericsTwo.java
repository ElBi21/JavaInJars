package Lesson_10;

public class GenericsTwo <E> extends GenericsOne <E> {
    E something = null;

    Integer methodG2(E x) {
        return 88;
    }

    public static void TestGenericsTwo () {
        // Testing generic subtypes

        GenericsOne<Object> x = new GenericsOne<Object>();
        x = new GenericsTwo<Object>(); // GenericsTwo<Object> is a subtype of GenericsOne<Object>
        // x = new GenericsOne<String>(); // GenericsOne<String> is *not* a subtype of GenericsOne<Object>.
        // Explain why: co- & contra- variance

        // Covariance allows using a method of a super class with any element of any class which extends the super
        // class, while


        System.out.println("\n");
    }
}