package Lesson_16;

import java.lang.reflect.*;

/** Reflection allows violating private fields
 */
public class Violation {
    public static void TestViolation() throws Exception {
        ArrayStack s = new ArrayStack(10);
        s.push(31);
        s.push(32);
        s.push(33);

        // WRE: s.top = 1; // It's not possible, since top is private! However, using reflection, we can edit that
        //      attribute to our pleasure

        try {
            Class<?> C = s.getClass();
            Field f = C.getDeclaredField("top");
            f.setAccessible(true); // We must inhibit access control first
            // C.getDeclaredField("top").setAccessible(true); // This is also possible
            f.set(s, 1);    // Syntax: attribute.set(object, valueToSet);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("ciao");
            e.printStackTrace();
        }
        System.out.println(s.pop()); // one stack element missing!
    }
}