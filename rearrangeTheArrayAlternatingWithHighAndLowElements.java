public class rearrangeTheArrayAlternatingWithHighAndLowElements {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 8, 7};
        int n = arr.length;
        int temp = 0;
        for (int i = 1; i < n - 1; i = i + 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
