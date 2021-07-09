package CaseStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QLTK {
    static Scanner sc = new Scanner(System.in);

    static File file2 = new File("./src/CaseStudy/Account.txt");
    static ArrayList<Account> list1 = docFile();

    //   ========================================================================
    public static void ghiFile(File file) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Account pp : list1) {
                bufferedWriter.write(pp.ghi1());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    //    ================================
    //============================================
    public static ArrayList<Account> docFile() {
        ArrayList<Account> list2 = new ArrayList<>();
        try {
            if(!file2.exists()){
                file2.createNewFile();
            }
            FileReader fileReader = new FileReader(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 2) {
                    list2.add(new Account(str[0], str[1]));
                }
            }
//            for(Account x:list2){
//                System.out.println(x);
//            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list2;
    }

    //    ==============================================================
    public static void addAcount() throws Exception {
        String account = getAccount();
        System.out.println("Nhập mật khẩu ");
        String pass = sc.nextLine();
        list1.add(new Account(account, pass));
        ghiFile(file2);
    }

    //    ==============================
    private static String getAccount() {
        while (true) {
            try {
                String regex="^[a-zA-z0-9]\\w{0,}";
                System.out.println("Nhập tên tài khoản: ");
                String acc = sc.nextLine();
                if(!acc.matches(regex)){
                    throw new IllegalAccessException();
                }
                for (Account nv : list1) {
                    if (nv.getAcc().equals(acc))
                        throw new InterruptedException();
                }
                return acc;
            } catch (InterruptedException e) {
                System.out.println("Đã tồn tại ");
            }catch (IllegalAccessException e){
                System.out.println("Lỗi !!!");
            }
        }
    }

    //=====================================
    public static void removeAcc() throws Exception {
        System.out.print("Nhập tên tài khoản bạn muốn xoá : ");
        String acc = sc.nextLine();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getAcc().equals(acc)) {
                list1.remove(i);
                i--;
            }
        }
        ghiFile(file2);
    }
//    ================================================

    public static boolean singIn() {
        System.out.print("Nhập tài khoản : ");
        String acc = sc.nextLine();
        System.out.print("Nhập mật khẩu : ");
        String pass = sc.nextLine();
        for (Account x : list1) {
            if (x.getAcc().equals(acc) && x.getPass().equals(pass)) {
                return true;
            }
        }
        return false;

    }

    public static void show() {
        for (Account x : list1) {
            System.out.println(x.getAcc());
        }
    }


}
