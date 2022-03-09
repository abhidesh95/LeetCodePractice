package medium;
//https://leetcode.com/problems/container-with-most-water/
public class MaxWaterContainer {
    public static void main(String[] args) {
        System.out.println(Solution10.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(Solution10.maxArea(new int[]{2,1}));
        System.out.println(Solution10.maxArea(new int[]{1,2,3,4,5,6}));
        System.out.println(Solution10.maxArea(new int[]{1,1,3,1,1}));
        System.out.println(Solution10.maxArea(new int[]{1,3,4,2,2,6}));
    }
}



class Solution10 {
    public static int maxArea(int[] height) {
        int len=height.length;
        int leftIndex=0,rightIndex=len-1;
        int maxProduct=0;
        while(leftIndex<rightIndex)
        {
            int currentProduct=0;
            int left=height[leftIndex];
            int right=height[rightIndex];

            if(left < right)
            {
                currentProduct= left * (rightIndex-leftIndex);
                leftIndex++;
            }
            else
            {
                currentProduct= right * (rightIndex-leftIndex);
                rightIndex--;
            }
            if(currentProduct > maxProduct)
                maxProduct=currentProduct;
        }
        return maxProduct;
    }
}