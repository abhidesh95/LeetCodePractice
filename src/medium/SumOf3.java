package medium;
//https://leetcode.com/problems/3sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3 {
    public static void main(String[] args) {
        System.out.println(Solution9.threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(Solution9.threeSum(new int[]{1,-1,-1,0}));
    }
}



class Solution9 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        int len=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<len-1;i++)
        {
            int iNum=nums[i];
            if(i>0 && iNum ==nums[i-1])
                continue;

            int left=i+1;
            int right=len-1;

            while(left<right)
            {
               int leftNum=nums[left];
               int rightNum=nums[right];
                int threeSum= iNum+leftNum+rightNum;
                if(threeSum > 0)
                    right--;
                else if(threeSum < 0)
                    left++;
                else
                {
                    lists.add(Arrays.asList(iNum,leftNum,rightNum));
                    left++;
                    while(nums[left]== nums[left-1] && left<right)
                        left++;
                }

            }

        }
        return lists;
    }
}