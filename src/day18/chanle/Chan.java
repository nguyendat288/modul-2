package day18.chanle;

public class Chan extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==0){
                System.out.println(i);

            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
