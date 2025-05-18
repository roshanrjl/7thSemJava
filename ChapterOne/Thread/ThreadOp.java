class Mythread implements Runnable
{

    @Override
    public void run() {
       for (int i=0; i<10; i++)
       {
           System.out.println("Thread: " + Thread.currentThread().getName() + " - " + i);
           try{
            Thread.sleep(1000);
           }catch(InterruptedException e){
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Interrupted");
           }
         
       }
    }

    public static void main(String[] args) {
        //creating the object of Mythread class
        Mythread myThread = new Mythread();
        Thread thread1 = new Thread(myThread);
        //creating the object of Thread class
        MyAnotherThread t = new MyAnotherThread();

        thread1.start();
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
        
    }

}
