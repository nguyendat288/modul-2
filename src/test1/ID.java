package test1;

import java.util.Scanner;

public class ID extends Exception {
    static Scanner sc = new Scanner(System.in);

    public static boolean checkID(int id) {
        for (SanPham x : QLSP.list) {
            if (x.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public static int getId() {
        while (true) {
            try {
                System.out.println("nhập id :");
                int id = Integer.parseInt(sc.nextLine());
                if (checkID(id) == true) {
                    return id;
                } else throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("Trùng cmnr");
            } catch (Exception e) {
                System.out.println("sai cmnr");
            }
        }
    }
}
