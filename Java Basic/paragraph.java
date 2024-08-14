
public class paragraph {
    public static void main(String[] args) {
        String paragraph = "Xiao Yan, A Former PRODIGY, Loses His Powers and Talent, HUMILIATING His Family, Battle Through The Heavens (BTTH)";
        // Find UpperCase's
        System.out.println("UpperCase Charactrs: ");
        for (char c : paragraph.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(c + " ");
            }
        }
        // Find LowerCase
        System.out.println("\nLowerCase Characters: ");
        for (char c : paragraph.toCharArray()) {
            if(Character.isLowerCase(c)) {
                System.out.print(c + " ");
            }
        }
        // Find Whitespaces
        System.out.println("\nNumber of Whitespaces: " + countWhitespaces(paragraph));
    }
    public static int countWhitespaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count++;
    }
}
