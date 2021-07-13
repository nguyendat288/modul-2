package phone;

import java.util.Scanner;

public class ChoiceCondition extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static int getChoise(){
        while (true){
            try{
                System.out.print("Nhập lựa chọn của bạn : ");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai định dạng");
            }
        }
    }
}
