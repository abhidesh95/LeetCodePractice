package medium;

import static medium.Solution8.search;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class FindTargetRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
        System.out.println(search(new int[]{4,5,6,7,0,1,2},3));
        System.out.println(search(new int[]{2,3,4,5,6,7,8,9,1},9));
        System.out.println(search(new int[]{1},0));
        System.out.println(search(new int[]{1,3,5},5));
        System.out.println(search(new int[]{1,3},4));
        System.out.println(search(new int[]{1,3,4,5},3));
    }
}


class Solution8 {
    public static int search(int[] nums, int target) {
        return searchWithOffset(nums,target,0);
    }

    public static int searchWithOffset(int[] nums, int target,int indexOffset) {
        int len = nums.length;
        int first = nums[0];
        int last = nums[len - 1];
        int firstIndex = 0, lastIndex = len - 1;

        if(nums.length==2)
        {
            if(first==target)
                return indexOffset;
            else if(last==target)
                return ++indexOffset;
            else
                return -1;
        }
        if(nums.length==1 && target !=first)
            return -1;

        if (target == first)
            return indexOffset;
        else {
            int mid = (len / 2);

            int iMid = nums[mid];
            if(first <= iMid)
            {
                if(target > iMid || target < first) {
                    indexOffset += mid;
                    firstIndex = mid;
                }
                else
                {
                    lastIndex=mid;
                }
            }else
            {
                if(target < iMid || target >  last)
                {
                    lastIndex=mid;
                }
                else {
                    indexOffset += mid;
                    firstIndex = mid;
                }
            }

            return searchWithOffset(Solution8.getSubArray(firstIndex, lastIndex, nums), target,indexOffset);
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