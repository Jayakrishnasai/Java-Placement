import java.util.*;
public class pushZeroToLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        sc.close();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
