package day18.SimpleThread;

public class Main {
    public static void main(String[] args) {


        NumberGenerator num1 = new NumberGenerator("A");
        Thread thread = new Thread(num1);
        thread.setPriority(Thread.MIN_PRIORITY);
        NumberGenerator num2 = new NumberGenerator("B");
        Thread thread1 = new Thread(num2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread.start();

    }
}
