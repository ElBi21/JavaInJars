package Lesson_15;

public class ListElem <E> {
    public E value;
    public ListElem<E> next = null;

    ListElem (E value) {
        this.value = value;
    }
}
