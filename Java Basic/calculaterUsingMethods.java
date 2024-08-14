import java.util.*;
public class calculaterUsingMethods {
    public static int addition(int a, int b){
        return a + b;
    } public static int substraction(int a, int b) {
        return a - b;
    } public static int multiplication(int a, int b) {
        return a * b;
    } public static int division(int a, int b) {
        return a / b;
    }public static int moduls(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 1 st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of 2 nd number : ");
        int b = sc.nextInt();

        System.out.print("Enter Your Choice Here( + / - / * / /): ");
        char choice = sc.next().charAt(0);
        int reslt = 0;
        switch(choice) {
            case '+':
            reslt = addition(a, b);
            System.out.println("Addition : " + reslt);
            break;
            case '-':
            reslt = substraction(a, b);
            System.out.println("Substraction : " + reslt);
            break;
            case '*':
            reslt = multiplication(a, b);
            System.out.println("Multiplication : " + reslt);
            break;
            case '/':
            reslt = division(a, b);
            System.out.println("Division : " + reslt);
            break;
            case '%':
            reslt = moduls(a, b);
            System.out.println("Remainder : " + reslt);
            break;
            default :
            System.out.println("INVALID OPERATION, CHOOSE THE VALID OPERATION");
            break;
        }
        sc.close();
    }
}
