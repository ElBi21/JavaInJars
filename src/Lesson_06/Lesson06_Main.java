package Lesson_06;
import Lesson_06.Package01.*;
import Lesson_06.Package02.*;
import Lesson_06.Package03.*;
import Lesson_06.Package04.*;

public class Lesson06_Main {
    public static void main(String[] args) {
        System.out.println("------- Starting Package 01 Test -------");
        TestPackage01Class.TestPackage01();

        System.out.println("------- Starting Package 02 Test -------");
        TestPackage02Class.TestPackage02();

        System.out.println("------- Starting Package 03 Test -------");
        TestPackage03Class.TestPackage03();

        System.out.println("------- Starting Package 04 Test -------");
        TestPackage04Class.TestPackage04();

        System.out.println("------- Starting PSVM Args Test -------");
        int val = 3;
        System.out.println(val + Integer.parseInt(args[0]));
    }
}
