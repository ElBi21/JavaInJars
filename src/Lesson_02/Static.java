package Lesson_02;

public class Static {
    public static void main(String[] args) {
        System.out.println("SIUUUUUUUM");
        System.out.println(weirdSum(41, 53));
    }

    /* What does "static" mean? Static indicates that no objects are
     *  involved inside the methods
     */

    public static int weirdSum(int x, int y){
        while (y > 0) {
            --y;
            x++;
        }

        return x;
    }
}