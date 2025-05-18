 class MyAnotherThread extends Thread {

    public void run(){
        for(int i=10; i>0; i--){
            System.out.println("Another Thread:" +Thread.currentThread().getName()+"="+i);
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println("Another Thread:" +Thread.currentThread().getName()+"=Interrupted");
            }
        }
    }

}
