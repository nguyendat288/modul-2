package day20;

import java.util.ArrayList;

public class ChuoiCon {
    public static void main(String[] args) {

        String str = "abcd";
        ArrayList<String> list=new ArrayList<>();
        String[] arr=str.split("");

        for(String x: arr){
            System.out.println(x);
        }
        for(int i =0;i< arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int e = 2; e < arr.length; e++) {
                    if (!arr[i].equals(arr[j])&&!arr[i].equals(arr[e])&&!arr[j].equals(arr[e])) {
                        String s1=arr[i].concat(arr[j]);
                        list.add(s1.concat(arr[e]));
                    }
                }
            }
        }
        for(int i =0;i< arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                    if (!arr[i].equals(arr[j])) {
                        list.add(arr[i].concat(arr[j]));
                }
            }
        }
        for(String y:list){
            System.out.println(y);
        }

    }
}