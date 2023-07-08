package Lesson_08;

import Lesson_04.EmptyStackException;

public class Lesson08_Main {
    public static void main(String[] args) throws EmptyStackException {
        System.out.println("------- Starting Reverse Stacks Test -------");
        ReverseStack.TestStackWithInterfaces();

        System.out.println("------- Starting Interfaces Clash Test -------");
        TestInterfacesClash();

        System.out.println("------- Starting Inner Classes Test -------");
        TestStates();

        System.out.println("------- Starting Local Classes Test -------");
        TestLocalClasses.TestLocalClass();
    }

    public static void TestInterfacesClash () {
        Clash testClash = new Clash();
        testClash.print();
    }

    public static void TestStates () {
        State switzerland = new State ("Switzerland","Franc",10000);
        System.out.println(switzerland.name);
        // WRE: switzerland.Coin f100;
        /* Although Coin is a *non* static member of State, it is nevertheless
         * referred to by prefixing it with the class name: */

        State.Coin f1 = switzerland.mint(100); // minted in Switzerland!
        f1.printValue();
        f1.printValueWithThis();

        // Why can't we use directly the constructor of Coin? Let's try to do it
        // WRE: State.Coin f2 = new State.Coin(77); // Error: no enclosing type!

        /* We would get an error which would ask us to provide an enclosing instance that will contain State.Coin.
         * State.Coin is indeed a type, but it cannot be used to call a constructor
         * because... to what state would it belong?! ...there is no outer object here! */

        // If we instead call the constructor from Switzerland, then we would be providing an enclosing instance
        State.Coin f2 = switzerland.new Coin(100); // Minted here, in foreign land!
        f2.printValue();
        f2.printValueWithThis();
        /* Notice: f2 is worth 100 francs, just like f1. However, because of inflation,
         * its value in gold is now half the value f1 had before! */
    }
}
