package Lesson_18;

@MyClassAnnotation(
        author = "Leonardo Biason",
        versionNumber = 1,
        date = "11/7/2023"
)
public class TestAnnotation extends SuperClass {
    @MyMethodAnnotation(
            state = MethodStates.APPROVED
    )
    public void method() {
        uglyMethod();
    }

    @Override
    void superMethod() {
    }

    public static void TestAnnotations() {
        new TestAnnotation().method();
    }
}
