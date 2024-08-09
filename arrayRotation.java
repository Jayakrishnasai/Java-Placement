import java.util.*;
public class arrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 7, 9, 12};
        System.out.println("Enter the Target Index: ");
        int n = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[(i + n) % arr.length] + " "); 
        }
        sc.close();
    }
}
