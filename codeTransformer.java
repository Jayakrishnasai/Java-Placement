import java.util.Scanner;
public class codeTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] input1 = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            input1[i] = scanner.nextInt();
        }
        String[] result = transformCodes(input1);
        System.out.println("Transformed codes:");
        for (String s : result) {
            System.out.println(s);
        }
    }
    public static String[] transformCodes(int[] input1) {
        String[] result = new String[input1.length];
        for (int i = 0; i < input1.length; i++) {
            String answer = "";
            int n = input1[i];
            if (String.valueOf(n).length() == 6) {
                answer += "C";
            } else {
                answer += "W";
            }

            if (isPrime(n)) {
                answer += "P";
            } else {
                answer += "N";
            }

            int sum = sumOfDigits(n);
            answer += sum;

            if (n % 2 == 0) {
                answer += n / 2;
            } else {
                answer += (n - 1) / 2;
            }

            result[i] = answer;
        }
        return result;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum > 9 ? sumOfDigits(sum) : sum;
    }
}
