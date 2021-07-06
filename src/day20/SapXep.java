package day20;

public class SapXep {
    public static void main(String[] args) {
        int[] arr = {5, -1, 6, 1, -1, 10, -1, 9, 8, -1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]&&arr[i]!=-1&&arr[j]!=-1){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x=0;x<arr.length;x++){
//            if(arr[x]!=-1) {
                System.out.print(arr[x] + " ");
//            }
        }
    }
}
