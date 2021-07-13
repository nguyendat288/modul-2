package phone;
import java.util.Scanner;
public class PhoneCondition extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static boolean checkPhone(String phone) {
        String str1 = "0[3-9]{1}\\d{8}";
        if (phone.matches(str1)) {
            return true;
        } else return false;
    }

    public static boolean checkPhone1(String phone) {
        for (Phone sdt : QLDT.list) {
            if (sdt.getSdt().equals(phone))
                return false;
        }
        return true;
    }

    public static String getPhone() {
        while (true) {
            try {
                System.out.print("Enter the phone number: ");
                String phone = sc.nextLine();
                if (checkPhone(phone) == true) {
                    if (checkPhone1(phone) == true) {
                        return phone;
                    } else throw new InterruptedException();
                }else throw new IllegalAccessException();
            } catch (InterruptedException e) {
                System.out.println("Đã tồn tại !!!");
            }catch (IllegalAccessException e){
                System.out.println("Sai định dạng !!!");
            }

        }
    }
    public static void main(String[] args) {
        getPhone();
    }
}
