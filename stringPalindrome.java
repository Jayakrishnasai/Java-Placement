public class stringPalindrome {
    public static void main(String[] args) {
        String str = "SaaS";
        boolean sai = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                sai = false;
                break;
            }
        }if (sai) {
            System.out.println(str + " is Palindrome ");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
