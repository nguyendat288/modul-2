package day18.car;
public class Car1 extends Thread {
  private int speed;

    public Car1(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        int s;
        long startTime = System.currentTimeMillis();
        try {
            for (s=0;s<1000;s+=speed) {
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("xe 1 : "+(endTime-startTime));
    }
}
