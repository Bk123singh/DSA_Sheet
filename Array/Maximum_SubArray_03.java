public class Maximum_SubArray_03 {
    public static void maxSubArray(int arra[]) {
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < arra.length; i++) {
            curr += arra[i];

            if (curr < 0) {
                curr = 0;
            }
            maxSum = Math.max(curr, maxSum);
        }
        System.out.println("Max sum is " + maxSum);
    }

    public static void main(String[] args) {
        int arra[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum sub array sum is ");
        maxSubArray(arra);
    }
}
