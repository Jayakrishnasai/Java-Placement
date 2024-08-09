public class vowelCount {
    public static void main(String[] args) {
        String str = "NaniSai";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        System.out.println("Vowel Count for "+ str +" is: " + count);
    }
}
