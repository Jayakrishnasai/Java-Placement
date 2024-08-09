public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {4, 9, 5, 4};
        int[] b = {9, 4, 9, 8, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
               if (a[i] == b[j]) {
                System.out.print(a[i] +" ");
                break;
               }
            }
        }
    }
}
