package easy;
//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(Solution5.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(Solution5.maxSubArray(new int[]{-2,-1,-3,-2}));
    }
}

class Solution5 {
    public static int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;
        for (int currentNum : nums) {
            if (currentSum < 0)
                currentSum = 0;
            currentSum += currentNum;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
