package Lesson_11;

public class MyReadable <E> implements Readable <E> {
    private E value;

    MyReadable (E value) {
        this.value = value;
    }

    public E get() {
        return value;
    }
}