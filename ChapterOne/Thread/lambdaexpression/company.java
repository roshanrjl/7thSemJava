package lambdaexpression;

public class company {
    private int item;
    boolean f= false;
     // f=false means item is not produced so producer thread will produce item
    // f=true means item is produced so consumer thread will consume item
    public synchronized int consume(){
        while(!f){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
            }
        }
        System.out.println("Consumed: " + item);
        f = false;
        notify();
        return item;
    }

    public synchronized void produce(int item){
        while(f){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
            }
        }
        this.item = item;
        System.out.println("Produced: " + item);
        f = true;
        notify();
    }
    
}
