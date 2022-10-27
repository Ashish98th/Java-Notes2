//Q)HS-1

package set;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        HashSet<Long> set1 = new HashSet<>();
        HashSet<Long> set2 = new HashSet<>();
        //adding elements in set
        for(int i=0;i<n1;i++){
            long num = sc.nextLong();
            set1.add(num);
        }
        for(int i=0;i<n2;i++){
            long num =sc.nextLong();
            set2.add(num);
        }
        Iterator<Long> it = set1.iterator();
        long sum =0;
        while(it.hasNext()){
            Long num = it.next();
            if(set2.contains(num)){
                sum+=num;
            }
        }
        System.out.println(sum);
    }

}
