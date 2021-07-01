package Test;

import com.company.QLDT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Quản lý sinh viên  ");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm ");
            System.out.println("3. Sửa theo id");
            System.out.println("4. Xoá theo id");
            System.out.println("5. Sắp xếp theo id");
            System.out.println("6. Đọc từ File");
            System.out.println("7. Ghi vào File ");
            System.out.println("8. Exit ");
            System.out.print(" Enter your choice :");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    QLSV.show();
                    break;
                case 2:
                    QLSV.addSinhVien();

                    break;
                case 3:
                    QLSV.updateSinhVien();
                    break;
                case 4:
                    QLSV.removeSinhVien();
                    break;
                case 5 :
                    QLSV.sort();
                    break;
                case  6:
                    QLSV.docFile();
                    break;
                case 7:
                    QLSV.ghiFile();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
