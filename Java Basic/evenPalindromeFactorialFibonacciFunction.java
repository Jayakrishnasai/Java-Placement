import java.util.*;
public class evenPalindromeFactorialFibonacciFunction {
    public static void even(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is an Even Number.");
        } else {
            System.out.println(a + " is an Odd Number.");
        }
    }
    public static void sumOfNNumbers(int a) {
        int sum = (a * (a + 1)) / 2;
        System.out.println("Sum of first " + a + " numbers is: " + sum);
    }
    public static void palindrome(String a) {
        String reversed = new StringBuilder(a).reverse().toString();
        if (a.equals(reversed)) {
            System.out.println(a + " is a Palindrome.");
        } else {
            System.out.println(a + " is not a Palindrome.");
        }
    }
    public static void factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
    public static void fibonacci(int a) {
        int n1 = 0, n2 = 1, n3 = 0;
        if (a == 0) {
            n3 = n1;
        } else if (a == 1) {
            n3 = n2;
        } else {
            for (int i = 2; i <= a; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        System.out.println(a + "th Fibonacci number is: " + n3);
    }
    public static void prime(int a) {
        if (a <= 1) {
            System.out.println(a + " is not a Prime Number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println(a + " is not a Prime Number.");
                return;
            }
        }
        System.out.println(a + " is a Prime Number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------ 👇Enter the Choice Given Below👇 ------");
            System.out.println("1. Even or Odd\n2. Palindrome\n3. Factorial\n4. Fibonacci\n5. Prime or not\n6. Sum of N Numbers\n7. Exit");
            System.out.print("Enter the Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Number: ");
                    int num = sc.nextInt();
                    even(num);
                    break;

                case 2:
                    System.out.print("Enter the String: ");
                    String str = sc.nextLine();
                    palindrome(str);
                    break;

                case 3:
                    System.out.print("Enter the Number: ");
                    int num2 = sc.nextInt();
                    factorial(num2);
                    break;

                case 4:
                    System.out.print("Enter the Number: ");
                    int num3 = sc.nextInt();
                    fibonacci(num3);
                    break;

                case 5:
                    System.out.print("Enter the Number: ");
                    int num4 = sc.nextInt();
                    prime(num4);
                    break;

                case 6:
                    System.out.print("Enter the Number: ");
                    int num5 = sc.nextInt();
                    sumOfNNumbers(num5);
                    break;

                case 7:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
