package producerConsumerProblem;

public class company {
    int n;
    boolean f = false;
    // f=false means item is not produced so producer thread will produce item
    // f=true means item is produced so consumer thread will consume item

    synchronized public void produce_item(int n) {
        if (f) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
            }
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() {
        if (!f) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
            }
        }

        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;

    }
}
