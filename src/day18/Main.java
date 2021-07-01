package day18;

public class Main {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        MyThread2 my2 = new MyThread2();
        Thread thread2 = new Thread(my2);
    my1.start();
    thread2.start();

    }
}
