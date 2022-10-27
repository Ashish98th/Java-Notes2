package SEARCHING;
import java.util.*;
public class Find_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        searchX(arr,target);
    }

    private static void searchX(int[] arr, int target) {
        if(arr.length==0){
            return;
        }
        boolean isFound =false;
        for(int index =0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                isFound =true;
                System.out.print(index+" ");
            }

        }
        if(isFound == false){
            System.out.println("Not found");







        }
    }

}
