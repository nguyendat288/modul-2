package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QLDT {
    static ArrayList<Phone> list = new ArrayList<>();

    static File file =new File("C:\\Users\\Admin\\Documents\\lap trinh Java\\QLcontact.txt");


    static Scanner sc=new Scanner(System.in);
    public static void show() {
        try {
            docFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //==============================================
    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Phone pp : list) {
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
        ArrayList<Phone> list1=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 7) {
                    //long sdt, String group, String name, String gender, String address, int bird, String email
                    list1.add(new Phone(Long.parseLong(str[0]),(str[1].trim()), str[2], str[3],str[4],Integer.parseInt(str[5]),str[6]));
                }
            }
            for(Phone x:list1){
                System.out.println(x);
            }
            bufferedReader.close();
            //=============================================
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //=========================================
    public static void addPhone() throws IOException {
        long sdt=getPhone();
        System.out.print("Enter the group :");
        String group=sc.nextLine();
        System.out.print("Enter the name :");
        String name=sc.nextLine();
        String gender=getGender();
        System.out.print("Enter the address: ");
        String address=sc.nextLine();
        System.out.print("Enter the birthday: ");
        int bird=Integer.parseInt(sc.nextLine());
        System.out.print("Enter the email:");
        String email=sc.nextLine();
        Phone phone=new Phone(sdt,group,name,gender,address,bird,email);
        list.add(phone);
        ghiFile();
    }
    public static void showList(){
        for(Phone x:list){
            System.out.println(x);
        }
    }
    public static long getPhone(){
        while (true){
            try{
                System.out.print("Enter the phone number: ");
                return Long.parseLong(sc.nextLine());

            }catch (Exception e){
                System.out.print("Enter again : ");
            }
        }
    }
    public static String getGender(){
        while (true){
            try{
                System.out.print("Enter the gender: ");
                String gender=sc.nextLine();
                if(gender.equals("nam")||gender.equals("nu")){
                    return gender;
                }else throw new GenderCondition();
            }catch (GenderCondition e ){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void removePhoneNumber()throws Exception{
        System.out.print(" Enter the phone number you want to remove : ");
        long sdt=Long.parseLong(sc.nextLine());
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSdt()==sdt){
                list.remove(i);
                i--;
            }
        }
        ghiFile();
    }
    public static void findPhoneNumber(){
        System.out.print(" Enter the phone number you want to find : ");
        long sdt=Long.parseLong(sc.nextLine());
        for(Phone x:list){
            if(x.getSdt()==sdt){
                System.out.println(x);
            }
        }
    }
}
