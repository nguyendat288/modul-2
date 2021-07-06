package CaseStudy;

import java.util.Scanner;

public class AgeCond extends Exception{
    static Scanner sc = new Scanner(System.in);
    public static int getAge() {
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18)
                    throw new AgeCond();
                else
                    return age;
            } catch (AgeCond e) {
                System.out.println("Nhỏ hơn 18 tuổi !!!");
            }catch (Exception e){
                System.out.println("Sai định dạng !!!");
            }
        }
    }
}
