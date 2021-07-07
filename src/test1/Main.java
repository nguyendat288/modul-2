package test1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     while (true){
         System.out.println("-----------Chương trình quản lý sản phẩm -----------");
         System.out.println("1.Xem danh sách");
         System.out.println("2.Thêm mới ");
         System.out.println("3.Cập nhật");
         System.out.println("4.Xoá ");
         System.out.println("5.Sắp xếp ");
         System.out.println("6.Tìm sản phẩm có giá đắt nhất ");
         System.out.println("7.Đọc từ file");
         System.out.println("8.Ghi vào file");
         System.out.println("9.Thoát ");
         System.out.println("Lựa chọn của bạn :");
         int choice=Integer.parseInt(sc.nextLine());
         switch (choice){
             case 1:
                 QLSP.show();
                 break;
             case 2:
                 try {
                     QLSP.addProduct();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 break;
             case 3:
                 try {
                     QLSP.change();

                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 break;
             case 4:
                 try {
                     QLSP.remove();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 break;
             case 5:
                 try {
                     QLSP.sort();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 break;
             case 6:
                 QLSP.max();
                 break;
             case 7:
                 QLSP.docFile();
                 break;
             case 8:
                 try {
                     QLSP.ghiFile();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 break;
             case 9:
                 System.exit(0);
         }
     }
    }
}
