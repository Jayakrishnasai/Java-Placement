import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
            }
            if (temp == rev) {
                System.out.println("The number is a palindrome");
                } else {
                    System.out.println("The number is not a palindrome");
                    }
    }
}
