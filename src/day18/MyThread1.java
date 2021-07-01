package day18;

public class MyThread1 extends Thread{
    @Override
    public void run() {

        for (int i = 1; i <= 60; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
