package test1;

import CaseStudy.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLSP {
    static Scanner sc=new Scanner(System.in);

    static File file=new File("./src/CaseStudy/SanPham.csv");
    static ArrayList<SanPham> list=docFile();
    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {

            FileWriter fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (SanPham pp : list) {
                bufferedWriter.write(pp.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    //===int id, String name, int price, int soluong, String mota
    public static ArrayList<SanPham> docFile() {
        ArrayList<SanPham> list1 = new ArrayList<>();
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >=5) {
                    //int id, String name, int price, int soluong, String mota
                    list1.add(new SanPham(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),str[4]));
                }
            }
            for(SanPham x:list1){
                System.out.println(x);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list1;
    }
    //=================================================
    public static void addProduct()throws Exception{
        System.out.println("Nhập tên ");
        String name=sc.nextLine();
        System.out.println("Nhập mô tả ");
        String mota=sc.nextLine();
        list.add(new SanPham(ID.getId(),name,Price.getPrice(),Soluong.getSoluong(),mota));
        ghiFile();
    }
    public static void remove()throws Exception{
        System.out.print(" Nhập id bạn muốn xoá  : ");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                list.remove(i);
                i--;
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại id này!!!");
        }
        ghiFile();
    }
    public static void change()throws Exception {
        System.out.print("Nhập id bạn muốn sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        System.out.println("=======================//Nhập thông tin bạn muốn sửa//============================");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                System.out.println("Nhập tên ");
                String name=sc.nextLine();
                System.out.println("Nhập mô tả ");
                String mota=sc.nextLine();
                System.out.println();
                list.set(i,new SanPham(ID.getId(),name,Price.getPrice(),Soluong.getSoluong(),mota));
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại id này !!!");
        }
        ghiFile();
    }
    public static void sort()throws Exception{
        list.sort(Comparator.comparing(o -> ((SanPham) o).getId()));
        ghiFile();
    }
    public static void max(){
        int max=list.get(0).getPrice();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPrice()>max){
                max=list.get(i).getPrice();
            }
        }
        System.out.println(list.get(max).toString());
    }
public static void show(){
        for(SanPham x:list){
            System.out.println(x);
        }
}
}
