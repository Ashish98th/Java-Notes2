import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isFound = false;
        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (isFound == false) {
            System.out.println("Not Found");
        }
    }
}