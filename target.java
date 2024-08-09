import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int t=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                t = i;
                break;
            }
        }
            for (int i = t + 1; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < t; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print(arr[t]);
            sc.close();
        }
    }