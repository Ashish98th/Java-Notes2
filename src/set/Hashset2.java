package set;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            set.add(num);
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
//            int iter = it.next();
            System.out.print(it.next()+" ");
        }
    }
}
