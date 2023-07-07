package Lesson_06.Package04;

public class IntegerVar_01 implements IntegerVar {
    private int val = 0;

    public int get () {
        return val;
    }

    public void assign (int val) {
        this.val = val;
    }

    public void extraJunk () {
        System.out.println(55);
    }
}
