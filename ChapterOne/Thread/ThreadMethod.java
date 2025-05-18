public class ThreadMethod extends Thread {

    public void run(){
        int x=5+3;
        System.out.println("sum: " + x);
        System.out.println("Thread: " + Thread.currentThread().getName() + "  is Running");
    }
    public static void main(String[] args) {
        System.out.println("program started");
        System.out.println("currentThread is:"+Thread.currentThread().getName());
       ThreadMethod t1 = new ThreadMethod();
      t1.setName("first");
       t1.start();

       System.out.println("program ended");
    }
}
