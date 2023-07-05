package Lesson_01;

public class Sum {
    /** In order to store a class attribute we declare the type of
    *  the attribute and the name of the attribute
    * */

    int myAttribute = 100;

    // There can be also single-lines comments

    public static void main(String[] args) {
        /* The System.out.println method is polymorph: it can have as parameter
        *  any type of object / data and Java will print it*/
        System.out.println("Test");
        System.out.println(4324 + 1);
        System.out.println(myMethod(99, 101));
        System.out.println(secondMethod(4328, 432));
        System.out.println(whyShouldI(423, 654));
    }

    // In order to declare a method we do like so:
    public static int myMethod (int first, int second) {
        return first + second;
    }

    public static int secondMethod (int one, int two) {
        return myMethod(one, two) + (one * two);
    }

    public static int whyShouldI (int numberOne, int numberTwo) {
        int myResult = numberOne;

        while (numberTwo > 0) {
            ++myResult;
            numberTwo--;
        }

        return myResult;
    }

    /* Every method follows this scheme:
    *
    *                 Return type
    *                      |
    *                      |
    *       public static int myMethod (int first, int second) {
    *           //...             |
    *       }                     |
    *                             |
    *                      The name of the
    *                           method
    *
    * */
}
