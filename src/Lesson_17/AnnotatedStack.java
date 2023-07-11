package Lesson_17;
/** Overrides {@code length()}; IntelliJ inserts an {@code @Override} annotation. Notice: a constructor must be provided
 * because ArrayStack cannot be constructed by default.
 */
public class AnnotatedStack extends ArrayStack {
    AnnotatedStack() {
        super(10);
    }

    @Override
    public int length() {
        System.out.println("ciao!");
        return super.length();
    }

    // WRE: @Override // Will return error because there is no beSilly() method inside ArrayStack
    public void beSilly () {
        doNothing();
    }

    @Deprecated
    public void doNothing () {
    }
}
