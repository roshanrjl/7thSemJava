package lambdaexpression;

public class main {
    public static void main(String[] args) {
        company c = new company();
        Thread producer = new Thread(() -> {
            int i=1;
            while (true) {
                c.produce(i);
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                c.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
