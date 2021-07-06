package CaseStudy;

import java.util.Scanner;

public class IdCondition extends Exception {
    static Scanner sc = new Scanner(System.in);
    public static boolean checkId(int id) {

        for (NhanVien nv : QLNV.list) {
            if (nv.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public static int getId() {
        while (true) {
            try {
                System.out.print("Nhập id nhân viên : ");
                int id = Integer.parseInt(sc.next());
                if (checkId(id) == true) {
                    return id;
                } else throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("Đã tồn tại !!!");
            } catch (Exception e) {
                System.out.println("Sai định dạng !!!");
            }
        }
    }
}
