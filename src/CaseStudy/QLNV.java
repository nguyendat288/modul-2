package CaseStudy;

import com.company.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {
    static Scanner sc = new Scanner(System.in);

    static File file1 = new File("./src/CaseStudy/Nv.txt");
    static ArrayList<NhanVien> list = docFile();
    public static void addNhanVien() throws IOException {
        System.out.println("Thêm Nhân Viên ");
        System.out.println("1.Nhân Viên Part Time ");
        System.out.println("2.Nhân Viên Full Time  ");
        System.out.println("3.Exit");
        System.out.print("Enter your choice ");
        int x = Integer.parseInt(sc.nextLine());
        switch (x) {
            case 1:
                NhanVien nhanvien = addNV("part");
                list.add(nhanvien);
                ghiFile(file1);
                break;
            case 2:
                nhanvien = addNV("full");
                list.add(nhanvien);
                ghiFile(file1);
                break;
        }
    }

    //=====================================================
    public static NhanVien addNV(String type) {
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        if (type.equals("part")) {
            return new NvPartTime(IdCondition.getId(), name, AgeCond.getAge(), GenderCond.getGender(), PhoneCondi.getPhone(), EmailCondition.getEmail(), StatusCondi.getStatus(), SalaryCondi.getSalary(), TimeWorkCondi.getTimeWork());
        } else if (type.equals("full")) {
            return new NvFullTime(IdCondition.getId(), name, AgeCond.getAge(), GenderCond.getGender(), PhoneCondi.getPhone(), EmailCondition.getEmail(), StatusCondi.getStatus(), SalaryCondi.getSalary());
        } else return null;
    }

    // ===================================================
    public static void ghiFile(File file) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {

            FileWriter fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (NhanVien pp : list) {
                bufferedWriter.write(pp.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    //============================================
    public static ArrayList<NhanVien> docFile() {
        ArrayList<NhanVien> list1 = new ArrayList<>();
        try {
            if(!file1.exists()){
                file1.createNewFile();
            }
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length == 8) {
//                    int id,String name, int age, String gender, String phone, String email,boolean status, int salary
                    list1.add(new NvFullTime(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), str[3], str[4], str[5], Boolean.parseBoolean(str[6]), Integer.parseInt(str[7])));
                }
                if (str.length == 9) {
                    list1.add(new NvPartTime(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), str[3], str[4], str[5], Boolean.parseBoolean(str[6]), Integer.parseInt(str[7]),Integer.parseInt(str[8])));
                }
            }
//            for (NhanVien x : list1) {
//                System.out.println(x);
//            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list1;
    }

    //================================================
    public static void show() {
       for(NhanVien x:list){
           System.out.println(x);
       }
    }
    public static void show2() {
        int index=-1;
        for(int i=0;i<list.size();i++){
            if (list.get(i).toString().contains("NvPartTime")) {
                index=i;
                System.out.println(list.get(i).toString());
            }
        }
        if(index==-1){
            System.out.println("Không có nhân viên PartTime nào !!!");
        }
    }
    public static void show1() {
        int index=-1;
        for(int i=0;i<list.size();i++){
            if (list.get(i).toString().contains("NvFullTime")) {
                index=i;
                System.out.println(list.get(i).toString());
            }
        }
        if(index==-1){
            System.out.println("Không có nhân viên FullTime nào !!!");
        }
    }
    //================================================
    public static void removeNhanVien() throws Exception {
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
        ghiFile(file1);
    }

    //===============================================
    public static void changeInfor() throws Exception {
        System.out.print("Nhập id bạn muốn sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        int index=-1;
        System.out.println("=======================//Nhập thông tin bạn muốn sửa//============================");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index=i;
                if (list.get(i) instanceof NvPartTime) {
                    list.set(i, addNV("part"));
                    break;
                } else {
                    list.set(i, addNV("full"));
                    break;
                }
            }
        }
        if(index==-1){
            System.out.println("Không tồn tại id này !!!");
        }
        ghiFile(file1);
    }

    //===============================================
    public static void kiemTraInfor() {
        System.out.println("Nhập id bạn muốn kiểm tra");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                System.out.println(list.get(i).toString());
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại id này!!!");
        }
    }

    //=====================================================
    public static void changStatus() throws Exception {
        System.out.println("Nhập id bạn muốn thay đổi");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                if (StatusCondi.getStatus() == true) {
                    list.get(i).setStatus(false);
                    System.out.println("Nhân viên có id " + id + "đang nghỉ.");
                } else {
                    list.get(i).setStatus(true);
                    System.out.println("Nhân viên có id" + id + " đang làm việc.");
                }
                System.out.println("Đã thay đổi thành công !!!");
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại id này!!!");
        }
        ghiFile(file1);
    }
    //=====================================================
    public static void showLuong(){
        System.out.print("Nhập id bạn muốn hiển thị lương: ");
        int id = Integer.parseInt(sc.next());
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                System.out.print("Lương của nhân viên là : ");
                System.out.println(list.get(i).doanhThu());
            }
        }
        if(index==-1){
            System.out.println("Không tồn tại id này !!!");
        }
    }
    //=====================================================
    public static void sort() throws Exception{
        list.sort(Comparator.comparing(o -> ((NhanVien) o).getId()));
        ghiFile(file1);
    }


}
