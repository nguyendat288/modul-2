package test1;

import java.util.Scanner;

public class Price extends Exception{
    static Scanner sc=new Scanner(System.in);
    public static int getPrice(){
        while (true){
            try{
                System.out.println("Nhập giá ");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai cmnr ");
            }
        }
    }
}
