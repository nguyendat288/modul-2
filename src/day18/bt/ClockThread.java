package day18.bt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread extends Thread{
    @Override
    public void run(){
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss aa");
        while (true){
            Date now=new Date();
            String st=sdf.format(now);
            System.out.println(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
