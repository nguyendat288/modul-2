package CaseStudy;

import java.util.Scanner;

public class TimeWorkCondi extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static int getTimeWork() {
        while (true) {
            try {
                System.out.print("Nhập số giờ làm việc : ");
                return Integer.parseInt(sc.next());
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
            }
        }
    }


}
