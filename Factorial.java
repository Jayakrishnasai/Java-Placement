import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Non Negative Number: ");
        int n = sc.nextInt();
        sc.close();
        if(n < 0){
            System.out.println("Factorial does not exist for negative numbers");

        }else{
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
    public static long calculateFactorial(int n){
        if(n == 0) {
            return 1;
        }else{
            return n * calculateFactorial(n - 1);
        }
    }
}
