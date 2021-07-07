package test1;

import java.util.Scanner;

public class Soluong {
    static Scanner sc=new Scanner(System.in);
    public static int getSoluong(){
        while (true){
            try{
                System.out.println("Nhập số lượng ");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai cmnr ");
            }
        }
    }
}
