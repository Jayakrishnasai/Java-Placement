public class mostFrequentValueInStringAndItsFrequency {
    public static void main(String[] args) {
        String str = "nanisainanisai";
        int str0 = str.length();
        int maxCount = 0;
        char maxChar = ' ';
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < str0; i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            }
        }
        System.out.println("The most frequent character is '" + maxChar + "' with a frequency of " + maxCount);
    }
}