package day18;

public class Time {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            for (int i = 1; i <= 100000; i++) {
                System.out.println(Math.sin(i));
            }
            long end = System.currentTimeMillis();
            long t = end - start;
            System.out.println("Tổng thời gian: " + t + " millisecond");
        }
    }

