package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] arr={20,7,22,53,1,512,51,56};
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j< arr.length;j++){
                if(sum(chuSo(arr[i]))>sum(chuSo(arr[j]))) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(Integer x:arr){
            System.out.print(x+" ");
        }
    }
    public static List<Integer> chuSo(int n){
        ArrayList<Integer> list= new ArrayList<>();
   for(int i=0 ;n>=1;i++){
       int a =n%10;
       list.add(a);
       n=n/10;
   }
   return list;
    }
public static int sum(List<Integer> list){
        int sum=0;
        for(int j=0;j<list.size();j++) {
                sum += list.get(j);
            }
        return sum;
}
}
