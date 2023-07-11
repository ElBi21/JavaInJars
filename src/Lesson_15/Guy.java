package Lesson_15;

import java.util.Random;

/** Essentially, extracts a doll from the queue and kisses her, until the end of the ball. When extracting from the
 * queue (if empty) it may go waiting on the ball's waiting room.
 */
public class Guy extends Thread {
    public Guy (String nome) {
        super();
        setName(nome);
    }

    private void kissDoll (Doll P) {
        System.out.println( getName() + ": I'm kissing " + P.getName());
        P.wakeUp();
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < Ballroom.MAXDANCES; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(random.nextInt(50));
                Doll mySweetHeart = Ballroom.queue.extract();
                kissDoll(mySweetHeart);
            }
        } catch (InterruptedException e) {
            System.out.println("Bye sweethearts!");
        }
    }
}
