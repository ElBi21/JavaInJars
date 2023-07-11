package Lesson_16;

public class MyAgent implements Agent {
    private String name;

    public MyAgent(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("Agent" + this.name + "Is ready");
    }

    public void stillWait() {
        doNothing();
    }

    public void doNothing() {
    }
}
