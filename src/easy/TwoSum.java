package easy;
//https://leetcode.com/problems/two-sum/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static easy.Solution1.twoSum;

public class TwoSum {
    public static void main(String []a)
    {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3},4)));
    }
}


class Solution1 {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++) {
            int num=nums[i];
            if(map.containsKey(target - num)){
                return new int[]{map.get(target - num), i};
            }else {
                map.put(num, i);
            }
        }
        return new int[]{-1,-1};

    }
}