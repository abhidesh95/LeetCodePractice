package medium;

//https://leetcode.com/problems/maximum-product-subarray/

import java.util.Arrays;


public class MaxSubArrayProduct {
    public static void main(String[] args) {
        System.out.println(Solution6.maxProduct(new int[]{2,3,-2,4}));
        System.out.println(Solution6.maxProduct(new int[]{-2,0,-1}));
        System.out.println(Solution6.maxProduct(new int[]{2,-5,-2,-4,3}));
    }
}


class Solution6 {
    public static int maxProduct(int[] nums) {

        int maxProduct= Arrays.stream(nums).max().getAsInt();

        int currMax=1,currMin=1;
        for (int iNum : nums) {
            if (iNum == 0) {
                currMax = 1;
                currMin = 1;
                continue;
            }
            int temp = currMax * iNum;
            currMax = Math.max(iNum * currMax, Math.max(iNum * currMin, iNum));
            currMin = Math.min(temp, Math.min(iNum * currMin, iNum));
            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;

    }
}