package day18.car;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int speed1 = (new Random()).nextInt(100);
        int speed2 = (new Random()).nextInt(100);
        int speed3 = (new Random()).nextInt(100);
        Car1 car1 = new Car1(speed1);
        Car2 car2 = new Car2(speed2);
        Car3 car3 = new Car3(speed3);
        car1.start();
        car2.start();
        car3.start();
    }
}
