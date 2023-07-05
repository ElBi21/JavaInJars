package Lesson_02;

public class MainCl {
    public static void main(String[] args) {
        System.out.println("SIUUUUUUUM");
        System.out.println(sillySum(41, 53));
    }

    /* What does "static" mean? Static indicates that no objects are
     *  involved inside the methods
     */

    public static int sillySum(int x, int y){
        while (y > 0) {
            --y;
            x++;
        }

        return x;
    }
}