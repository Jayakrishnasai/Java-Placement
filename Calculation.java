import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator");
        String op = sc.next();
        try {
            switch (op) {
                case "sum":
                System.out.println("Sum of two numbers is " + (num1 + num2));
                break;
                case "diff":
                System.out.println("Difference of two numbers is " + (num1 - num2));
                break;
                case "mul":
                System.out.println("Multiplication of two numbers is " + (num1 * num2));
                break;
                case "div":
                if (num2 != 0) {
                    System.out.println("Division of two numbers is " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                        }
                        break;
                case "Mod":
                System.out.println("Modulus of two numbers is " + (num1 % num2));
                break;
                        default:
                        System.out.println("Invalid operator");
                        }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input");
                            sc.next(); // discard invalid input
                            }
                            sc.close();
         }
  
    }
