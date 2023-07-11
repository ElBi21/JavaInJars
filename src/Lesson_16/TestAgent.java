package Lesson_16;

import java.lang.reflect.*;

/** We want to write a program for testing homeworks. The homework requires implementing interface {@link Agent}.
 *  Typical mistakes are giving classes different names from the required (in this case {@code MyAgent}), or not
 *  implementing the required methods (such as {@code action()}). Using reflection we can write a test program before
 *  any implementation is provided: errors which would normally be captured at compile time can now be treated at
 *  run time.
 */
public class TestAgent {
    public static void TestAgents() {
        // In order to test, we don't really need to implement an object of type Agent, but we can use reflection to see
        // if one class exists. All of this can be done in a try {} catch {} block
        try {
            Class<?> theClass = Class.forName("Lesson_16.MyAgent");
            Type[] types = theClass.getGenericInterfaces();
            boolean found = false;
            for (Type possibleInterface : types) {
                if (possibleInterface.getTypeName() == "Agent") {
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Interface hasn't been implemented or it has been implemented with another name");
            }

            Method acting = theClass.getMethod("action");
        } catch (ClassNotFoundException exception) {
            System.out.println("Exception raised: " + exception);
        } catch (NoSuchMethodException exception) {
            System.out.println("Exception raised: " + exception);
        }
    }
}
