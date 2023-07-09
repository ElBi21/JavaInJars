package Lesson_10;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericsOne <E> {
    public void myPrint (E x) {
        System.out.println(x);
    }

    public static void TestGenericsOne () {
        GenericsOne<String> genericString = new GenericsOne<>();
        genericString.myPrint("Generic of type String!");
        // WRE: genericString.myPrint(new Integer(77)); // Must be first converted into String, because the Generics is
        //      of type String

        GenericsOne genericRaw = new GenericsOne(); // Raw type

        genericRaw.myPrint("Raw Generic!");
        genericRaw.myPrint(new Integer(77));

        // They seem to behave as if they were GenericsOne<Object>. The raw type allows for losing type checking, which
        // is different from doing GenericsOne<Object>. With GenericsOne<Object> we are telling the compiler that is it
        // capable of holding any Object. Java highly discourages raw types, and prefers instead to use other solutions.
        //
        // Why do we use the <Object> type? And when? Normally we use <Object> when we want to create a collection of
        // elements that we don't know a priori the elements' types. Using <Object> is also discouraged because the
        // following could happen: suppose that we have an ArrayList of type Object, because we want to make it capable
        // of holding any kind of data

        ArrayList<Object> listForEverything = new ArrayList<>();

        // Now suppose that we add inside the list multiple elements, such as an Integer, a Float, a String...

        listForEverything.add(new String("Hey there"));
        listForEverything.add(new Float(41561.654));
        listForEverything.add(new Integer(453));

        // The problem arises when we want to save in a variable an element of the list. Realistically, we wouldn't know
        // which object is first inside the list, so how do we determine the type? Let's suppose that we know the first
        // type, and thus we proceed to save the first element (a String) into a String variable

        // WRE: String theFirstElement = listForEverything.get(0);

        // We already get an error because Java is expecting an element of type Object. But how, isn't String a class
        // for objects as well? Well, yes, but when we declared the List, we declared it as a List of Objects. Because
        // of that, Java now considers all the elements inside as Objects of type Object, not as their actual type.
        // Moreover, it's true that Integers is a subclass of Object, but List<Integer> is not a subclass of
        // List<Object>. The following variable would've been correct, but would still cause some issues because of its
        // type

        Object theFirstElement = listForEverything.get(0);

        // As a proof about raw types, we can set a Generic of type String as a raw Generic, and vice-versa
        genericString = genericRaw;
        genericRaw = genericString;
    }
}
