package Lesson_16;

import java.lang.reflect.*;

public class Lesson16_Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, InvocationTargetException, IllegalAccessException, Exception {
        System.out.println("------- Starting Reflection Test -------");
        TestReflection.TestForReflection(args);

        System.out.println("------- Starting Agents Test -------");
        TestAgent.TestAgents();

        System.out.println("------- Starting Agents Test -------");
        Violation.TestViolation();
    }
}
