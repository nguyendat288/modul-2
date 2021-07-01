package day18.count;

public class Count implements Runnable {
    private Thread myThread;
    public Count(){
        myThread =new Thread(this,"my runnable thread");
        System.out.println("my thread create "+ myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Printing the count "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Count count=new Count();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
