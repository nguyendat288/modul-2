package phone;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        while (true){
            System.out.println("==============//Quản lý danh bạ//============= ");
            System.out.println("|           1.Xem danh bạ                     |");
            System.out.println("|           2.Thêm                            |");
            System.out.println("|           3.Sửa theo sdt                    |");
            System.out.println("|           4.Xoá theo sdt                    |");
            System.out.println("|           5.Tìm kiếm theo sdt               |");
            System.out.println("|           6.Đọc từ File                     |");
            System.out.println("|           7.Ghi vào File                    |");
            System.out.println("|           8.Exit                            |");
            System.out.println("_______________________________________________");
            int choice= ChoiceCondition.getChoise();
            switch (choice){
                case 1:
                    QLDT.show();
                    break;
                case 2:
                    QLDT.add();
                    break;
                case 3:
                    QLDT.changeInfo();
                    break;
                case 4:
                    QLDT.removePhoneNumber();
                    break;
                case 5 :
                    QLDT.findPhoneNumber();
                    break;
                case  6:
                    System.out.println("Bạn có chắc chắn muốn xoá toàn bộ File không ?");
                    System.out.println("1.có ");
                    System.out.println("2.Không");
                    int choice1=ChoiceCondition.getChoise();
                    switch (choice1){
                        case 1:
                            QLDT.docFile1();
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Không có lựa chọn này ");
                            break;
                    }
                    break;
                case 7:
                    QLDT.ghiFile();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này ");
                    break;
            }
        }
    }
}
