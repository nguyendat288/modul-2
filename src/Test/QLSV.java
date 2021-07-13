package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    static ArrayList<SinhVien> list=new ArrayList<>();
    static File file=new File("C:\\Users\\Admin\\Documents\\lap trinh Java\\SinhVien.csv");
    static Scanner sc=new Scanner(System.in);
    public static void show(){
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
    public static void showFile(){
        try {
            docFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addSinhVien() throws IOException{
        System.out.print("Enter the id :");
        int id=Integer.parseInt(sc.nextLine());
        System.out.print("Enter the name :");
        String name= sc.nextLine();
        int age=getAge();
        String gender=getGender();
        System.out.print("Enter the address :");
        String address=sc.nextLine();
        double mark=getMark();
        list.add(new SinhVien(id,name,age,gender,address,mark));
        ghiFile();
    }
    public static int getAge(){
        while (true){
            try{
                System.out.print("Enter the age :");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Wrong !!!");
            }
        }
    }
    public static String getGender(){
        while (true){
            try{
                System.out.print("Enter the gender ");
                String gender=sc.nextLine();
                if(gender.equals("nam")||gender.equals("nu")){
                    return gender;
                }else throw new GenderCondition();
            }catch (GenderCondition e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static double getMark(){
        while(true){
            try{
                System.out.print("Enter the mark: ");
                return Double.parseDouble(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai cmnr ");
            }
        }
    }
    public static void updateSinhVien() throws IOException{
        System.out.print("Enter the id you want to update :");
        int id=Integer.parseInt(sc.nextLine());
        if(index(id)==-1){
            System.out.println("Don't exist");
        }else {
            System.out.println("Enter the new imformation ");
            System.out.print("Enter the name :");
            String name= sc.nextLine();
            int age=getAge();
            String gender=getGender();
            System.out.print("Enter the address :");
            String address=sc.nextLine();
            double mark=getMark();
            list.add(new SinhVien(id,name,age,gender,address,mark));
            ghiFile();
        }
    }
    public static int index(int id){
        int index=-1;
        for(int i=0;i< list.size();i++){
            if(list.get(i).getId()==id){
                index=i;
                return index;
            }
        }
        return index;
    }
    public static void sort() throws IOException{
        list.sort(Comparator.comparing(o -> ((SinhVien) o).getId()));
        ghiFile();
    }
//====================================
public static void ghiFile() throws IOException {
    BufferedWriter bufferedWriter = null;
    try {
        FileWriter fileWriter = new FileWriter(file,false);
        bufferedWriter = new BufferedWriter(fileWriter);

        for (SinhVien pp : list) {
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
    public static void docFile() throws IOException {
        ArrayList<SinhVien> list1=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 6) {
                    list1.add(new SinhVien((Integer.parseInt(str[0])),str[1],(Integer.parseInt(str[2])),str[3],str[4],(Double.parseDouble(str[5]))));
                }
            }
            for(SinhVien x:list1){
                System.out.println(x);
            }
            bufferedReader.close();
            //=============================================
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeSinhVien(){
        System.out.print("Enter the id you want to remove :");
        int id=Integer.parseInt(sc.nextLine());
        if(index(id)==-1){
            System.out.println("Don't exist!");
        }else {
            System.out.println("Are you sure to delete it ?");
            System.out.println("1. Yes");
            System.out.println("2.No");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    list.remove(index(id));
                    try {
                        ghiFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    break;
            }
        }
    }
}
