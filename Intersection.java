public class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};

        boolean[] found = new boolean[b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && !found[j]) {
                    System.out.print(a[i] + " ");
                    found[j] = true;
                    break;
                }
            }
        }
    }
}