package producerConsumerProblem;

public class main {
    public static void main(String[] args) {
        company c = new company();
        producerThread p = new producerThread(c);
        consumerThreadv c1 = new consumerThreadv(c);
        p.start();
        c1.start();
    }
    
}
