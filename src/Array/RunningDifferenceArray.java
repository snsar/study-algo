package Array;

public class RunningDifferenceArray {
    public int[] findDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] differenceArray = new int[n];
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < n; i++) {
            rightSum = rightSum - nums[i] - leftSum;
            differenceArray[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }
        return differenceArray;
    }
}
