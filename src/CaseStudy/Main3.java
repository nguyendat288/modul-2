package CaseStudy;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main2() {
        while (true) {
            System.out.println("=====================//Quản lý nhân viên//==================");
            System.out.println("==========================================================");
            System.out.println("1.Kiểm tra thông tin nhân viên theo id");
            System.out.println("2.Thay đổi trạng thái nhân viên theo id");
            System.out.println("3.Hiển thị danh sách nhân viên");
            System.out.println("4.Hiển thì lương theo id");
            System.out.println("5.Sắp xếp nhân viên theo id ");
            System.out.println("6.Tìm kiếm nhân viên theo tên");
            System.out.println("7.Đăng xuất ");
            int choice = ChoiseCondi.getChoise();
            switch (choice){
                case 1:
                    QLNV.kiemTraInfor();
                    break;
                case 2:
                    try {
                        QLNV.changStatus();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("1.Hiển thị danh sách nhân viên FullTime");
                    System.out.println("2.Hiển thị danh sách nhân viên PartTime");
                    System.out.println("3.Hiển thị danh sách nhân viên");
                    int y=ChoiseCondi.getChoise();
                    switch (y){
                        case 1:
                            QLNV.show1();
                            break;
                        case 2:QLNV.show2();
                            break;
                        case 3:
                            QLNV.show();
                            break;
                        default:
                            System.out.println("Không có lựa chọn này !!!");
                            break;
                    }
                    break;
                case 4:
                    QLNV.showLuong();
                    break;
                case 5:
                    try {
                        QLNV.sort();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    QLNV.findbyName();
                    break;
                case 7:
                    Main.menuDanhap();
                    break;
                default:
                    System.out.println("Không có lựa chọn này !!!");
                    break;

            }

        }
    }
}
