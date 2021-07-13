package phone;

import java.util.Scanner;

public class BirthCondi extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static int getBirth() {
        while (true) {
            try {
                System.out.print("Enter the birthday : ");
                return Integer.parseInt(sc.next());
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
            }
        }
    }

    public static void main(String[] args) {
        getBirth();
    }
}
