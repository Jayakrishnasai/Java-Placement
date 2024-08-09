 public class SpliitWithAverage {
 
     public static void main(String[] args) {
         int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
 
         int totalSum = 0;
         int n = nums.length;
 
         for (int num : nums) {
             totalSum += num; 
         }
          if (totalSum % 2 != 0) {
             System.out.println("false");
             return; 
         }
 
         int targetSum = totalSum / 2; 
         boolean[] dp = new boolean[targetSum + 1]; 
         dp[0] = true; 
 
         for (int num : nums) {
             for (int j = targetSum; j >= num; j--) {
                 dp[j] = dp[j] || dp[j - num]; 
             }
         }
 
         if (!dp[targetSum]) {
             System.out.println("false");
             return;
         }
 
         boolean[] used = new boolean[n]; 
         int[] subsetA = new int[n];
         int sizeA = 0;
         @SuppressWarnings({"unused" })
         double avg1 = 0, avg2 = 0; 
 
         int sum = targetSum;
         for (int i = n - 1; i >= 0; i--) {
             if (sum >= nums[i] && dp[sum - nums[i]]) {
                 subsetA[sizeA++] = nums[i]; 
                 used[i] = true;
                 sum -= nums[i]; 
             }
         }
         int[] subsetB = new int[n]; 
         int sizeB = 0;
         for (int i = 0; i < n; i++) {
             if (!used[i]) {
                 subsetB[sizeB++] = nums[i];
             }
         }
          System.out.print("Subset A: ");
         for (int i = 0; i < sizeA; i++) {
             System.out.print(subsetA[i] + " ");
         }
         System.out.println();
 
         System.out.print("Subset B: ");
         for (int i = 0; i < sizeB; i++) {
             System.out.print(subsetB[i] + " ");
         }
         System.out.println();
         int sumA = 0; 
         int sumB = 0;
         
         for (int i = 0; i < sizeA; i++) {
             sumA += subsetA[i];
         }
 
         for (int i = 0; i < sizeB; i++) {
             sumB += subsetB[i];
         }
 
         if (sumA == sumB) {
             System.out.println("true");
         } else {
             System.out.println("false");
         }
 
         for (int i = 0; i < sizeA; i++) {
             avg1 = sumA / 4; 
         }
         for (int i = 0; i < sizeB; i++) {
             avg2 = sumB / 4; 
         }
 
        }
 }