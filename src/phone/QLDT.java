package phone;

import CaseStudy.NvPartTime;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QLDT {

    static Scanner sc=new Scanner(System.in);
    static File file =new File("./src/phone/QLDT.csv");
    static ArrayList<Phone> list = docFile();
    public static void show() {
        for(Phone x:list){
            System.out.println(x);
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
    public static ArrayList<Phone> docFile(){
        ArrayList<Phone> list1=new ArrayList<>();

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 7) {
                    //long sdt, String group, String name, String gender, String address, int birth, String email
                    list1.add(new Phone(str[0],(str[1].trim()), str[2], str[3],str[4],Integer.parseInt(str[5]),str[6]));
                }
            }
//            for(Phone x:list1){
//                System.out.println(x);
//            }
            bufferedReader.close();
            //=============================================
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list1;
    }
    //=========================================
    public static Phone addPhone(){
        System.out.print("Enter the group :");
        String group=sc.next();
        System.out.print("Enter the name :");
        String name=sc.next();
        String gender=getGender();
        System.out.print("Enter the address: ");
        String address=sc.next();
        Phone phone=new Phone(PhoneCondition.getPhone(),group,name,gender,address,BirthCondi.getBirth(),EmailCondi.getEmail());
        return phone;
    }
    public static void add()throws Exception{
        list.add(addPhone());
        ghiFile();
    }
    public static String getGender(){
        while (true){
            try{
                System.out.print("Enter the gender: ");
                String gender=sc.next();
                if(gender.equals("nam")||gender.equals("nu")){
                    return gender;
                }else throw new GenderCondition();
            }catch (GenderCondition e ){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void removePhoneNumber()throws Exception{
        System.out.print("Enter the phone number you want to remove :");
        String sdt=sc.next();
        int index=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSdt().equals(sdt)){
                index=i;
                list.remove(i);
                i--;
            }
        }
        if(index==-1){
            System.out.println("không có sdt này");
        }
        ghiFile();
    }
    public static void findPhoneNumber(){
        System.out.print("Enter the phone number you want to find :");
        String sdt=sc.next();
        for(Phone x:list){
            if(x.getSdt().equals(sdt)){
                System.out.println(x);
            }
        }
    }
    public static void changeInfo() throws Exception {
        System.out.print("Nhập sdt bạn muốn sửa : ");
        String sdt=sc.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSdt().equals(sdt)) {
                index = i;
                list.remove(i);
                list.add(i,addPhone());
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại sdt này !!!");
        }
        ghiFile();
    }
    public static void docFile1()throws Exception{
        list.clear();
        ghiFile();
    }
}
