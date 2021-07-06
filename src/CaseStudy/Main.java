package CaseStudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuDanhap();
    }
    public static void menuDanhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hệ thống đăng nhập ");
            System.out.println("1.Đăng nhập ");
            System.out.println("2.đăng kí ");
            System.out.println("3.Xoá tài khoản ");
            System.out.println("4.Hiển thị tài khoản");
            System.out.print("Lựa chọn của bạn : ");
            int choise = Integer.parseInt(sc.nextLine());

            switch (choise) {
                case 1:
                        if (QLTK.singIn() == true) {
                            Main2.main1();
                            break;
                        } else {
                            System.out.println("Tài khoản hoặc mật khẩu không chính xác !!!");
                            break;
                        }

                case 2 :
                    try {
                        QLTK.addAcount();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        QLTK.removeAcc();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    QLTK.show();
                    break;
            }
        }
    }

}
