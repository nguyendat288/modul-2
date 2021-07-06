package CaseStudy;

import java.util.Scanner;

public class SalaryCondi extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static int getSalary(){
        while (true){
            try{
                System.out.print("Nhập lương của nhân viên : ");
                return Integer.parseInt(sc.next());
            }catch (Exception e){
                System.out.println("Sai định dạng");
            }
        }
    }
}
