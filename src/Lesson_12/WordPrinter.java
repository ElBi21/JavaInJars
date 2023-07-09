package Lesson_12;

public class WordPrinter extends Thread {
    private final String word;

    public WordPrinter (String word) {
        this.word = word;
    }

    public void run () {
        System.out.println(word);
    }
}
