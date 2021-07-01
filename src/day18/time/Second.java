package day18.time;

import java.time.LocalTime;

public class Second extends Thread{
    LocalTime localTime = LocalTime.now();
    private int sec;
    private int min;

    @Override
    public void run() {
        min  = localTime.getMinute();
        try {
            for ( sec = localTime.getSecond();; sec++){
                Thread.sleep(1000);
                if (sec == 59){
                    sec =00;
                    min = min +1;
                }

            }
        }catch (Exception e){
        }
    }
}
