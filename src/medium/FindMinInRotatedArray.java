package medium;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

import java.util.Arrays;

import static medium.Solution7.findMin;

public class FindMinInRotatedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}



class Solution7 {
    public static int findMin(int[] nums) {
        int len=nums.length;
        int first=nums[0];
        int last=nums[len-1];
        int firstIndex=0,lastIndex=len-1;


        if(last>first || last==first)
            return first;
        else
        {
            int mid=(len/2);

                int iMid=nums[mid];
                if(iMid < last) {
                    lastIndex = mid;
                }
                else
                {
                    firstIndex=mid;
                }
            return findMin(getSubArray(firstIndex,lastIndex,nums));
        }

    }

    public static int[] getSubArray(int beg,int end,int[] arr)
    {
        int len=end - beg + 1;
        int[] subarray = new int[end - beg + 1];
        for (int i = 0; i < len; i++) {
            subarray[i] = arr[beg+i];
        }
        return subarray;
    }
}