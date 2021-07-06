package CaseStudy;

import java.util.Scanner;

public class GenderCond extends Exception{
    static Scanner sc = new Scanner(System.in);
    @Override
    public String getMessage() {
        return "Sai rồi !!!";
    }
    public static String getGender() {
        while (true) {
            try {
                System.out.print("Nhập giới tính : ");
                String gender = sc.nextLine();
                if (gender.equals("nam") || gender.equals("nu")) {
                    return gender;
                } else
                    throw new GenderCond();
            } catch (GenderCond e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        getGender();
    }
}
