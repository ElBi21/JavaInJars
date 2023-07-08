package Lesson_09;

public class GenericIdentity {
    // *non* generic class with a generic method

    public <E> E identity (E x) {
        return x;
    }

    public static void TestGenericIdentity() {
        GenericIdentity genIdentity = new GenericIdentity();
        Integer eight = new Integer(8);
        String hello = new String("hello");

        System.out.println("8 == identity<Integer>(8)? " + (eight == genIdentity.<Integer>identity(eight)));
        // What happens if we want to compare the number with its identity? Would the identity return the same value as
        // the original 8? The answer is, shortly said, yes. The equation is true because the object used to make the
        // identity is actually the Integer eight
        System.out.println("hello == identity<String>(hello)? " + (hello == genIdentity.<String>identity(hello)));
        // The same happens with hello
        // WRE: System.out.println(eight == genIdentity.<String>identity(eight)); // eight is not of type String

        System.out.println(new String("hello") == genIdentity.<String>identity(new String("hello")));
        // Would the identity of hello be equal to another string, identical to hello? The answer is no. What we are
        // comparing with == it's not the value by itself, but rather the object. Here we are comparing two different
        // objects. We can see that by printing the following:
        String helloOne = new String("hello");
        String helloTwo = new String("hello");

        System.out.println(System.identityHashCode(helloOne) + " | " + System.identityHashCode(helloTwo));
        // Here we printed the Hash codes of the two objects: we clearly see that the hashes differ. This means that we
        // are using two different objects. But how can we check the actual values, without caring about the objects? We
        // can use the equals() method, that lets us compare the two values

        System.out.println(new String("hello").equals(genIdentity.<String>identity(new String("hello"))));

        // This instead will return false. In general, == is used to compare if two operands point to the same object,
        // while in order to compare two objects we have to use the equal() method. In general, if we use equal() with a
        // null value, the result will always be false
        System.out.println((new Object().equals(new Object())));
        System.out.println(new Object() == new Object());
    }
}
