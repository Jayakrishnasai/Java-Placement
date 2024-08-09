import java.util.Set;
import java.util.HashSet;

public class UncommonCharacter {
    public static void main(String[] args) {
        // Define the input sets
        Set<Character> input1 = new HashSet<>();
        input1.add('A');
        input1.add('B');
        input1.add('C');

        Set<Character> input2 = new HashSet<>();
        input2.add('B');
        input2.add('C');
        input2.add('D');

        // Find the uncommon character and calculate the result
        int result = findUncommonSum(input1, input2);
        System.out.println(result);
    }

    public static int findUncommonSum(Set<Character> input1, Set<Character> input2) {
        // Find the uncommon characters in input1
        Set<Character> uncommonChars = new HashSet<>(input1);
        uncommonChars.removeAll(input2);

        // Get the ASCII value of the uncommon character (assuming only one)
        int uncommonAscii = 0;
        if (!uncommonChars.isEmpty()) {
            uncommonAscii = (int) uncommonChars.iterator().next();
        }

        // Calculate the single-digit sum of the ASCII value
        return sumDigits(uncommonAscii);
    }

    public static int sumDigits(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}