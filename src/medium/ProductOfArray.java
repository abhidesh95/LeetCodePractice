package medium;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution4.productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(Solution4.productExceptSelf(new int[]{-1,1,0,-3,3})));
        System.out.println(Arrays.toString(Solution4.productExceptSelf(new int[]{1,2,3})));
    }
}

class Solution4 {
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int [] arr=new int[len];
        arr[0]=1;
        for(int x=0;x<len-1;x++)
        {
            int xNum=nums[x];
            int preFixProduct=1;
            if(x!=0) {
                    preFixProduct = arr[x];
                }
            if(x+1 !=len) {
                arr[x + 1] = preFixProduct * xNum;
            }
        }
        int postFixProduct=1;
        for(int x=len-1;x>=0;x--)
        {
            int xNum=nums[x];
            arr[x] *= postFixProduct;
            postFixProduct*= xNum;
        }

        return arr;

    }
}
