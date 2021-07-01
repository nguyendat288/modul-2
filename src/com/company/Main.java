package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        while (true){
            System.out.println("Quản lý danh bạ ");
            System.out.println("1. Xem danh bạ");
            System.out.println("2. Thêm ");
            System.out.println("3. Sửa theo sdt");
            System.out.println("4. Xoá theo sdt");
            System.out.println("5. Tìm kiếm theo sdt");
            System.out.println("6. Đọc từ File");
            System.out.println("7. Ghi vào File ");
            System.out.println("8. Exit ");
            System.out.print(" Enter your choice :");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    QLDT.show();
                    break;
                case 2:
                    QLDT.addPhone();

                    break;
                case 4:
                    QLDT.removePhoneNumber();
                    break;
                case 5 :
                    QLDT.findPhoneNumber();
                    break;
                case  6:
                    QLDT.docFile();
                    break;
                case 7:
                    QLDT.ghiFile();
                    break;
                case 9:
                    QLDT.showList();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
