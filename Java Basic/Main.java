import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define the input sets
        Set<Character> input1 = new HashSet<>(Arrays.asList('A', 'B', 'C'));
        Set<Character> input2 = new HashSet<>(Arrays.asList('B', 'C', 'D'));

        // Find the uncommon characters in input1
        input1.removeAll(input2);

        // Calculate the ASCII sum of the uncommon characters
        int asciiSum = 0;
        for (char c : input1) {
            asciiSum += (int) c;
        }

        // Reduce the ASCII sum to a single-digit number
        int result = reduceToSingleDigit(asciiSum);

        // Print the result
        System.out.println(result);
    }

    // Helper method to reduce a number to a single-digit sum
    private static int reduceToSingleDigit(int num) {
        while (num >= 10) {
            num = num / 10 + num % 10;
        }
        return num;
    }
}
