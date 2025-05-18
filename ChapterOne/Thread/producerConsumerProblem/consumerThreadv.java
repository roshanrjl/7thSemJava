package producerConsumerProblem;

public class consumerThreadv extends Thread {
    company c;
    consumerThreadv(company c){
        this.c =c;
    }

    public void run(){
        while(true){
            int item = this.c.consume_item();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
            }
        }
    }
    
}
