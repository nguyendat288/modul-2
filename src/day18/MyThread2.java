package day18;

public class MyThread2 implements Runnable{
    @Override
    public void run(){
        int count=0;
        for(int i=count;;i++){
            System.out.println( i +" ");
            try {
                Thread.sleep(3600000);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
