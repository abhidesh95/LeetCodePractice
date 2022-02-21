package easy;
//https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String []a){
        System.out.println(Solution3.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(Solution3.containsDuplicate(new int[]{1,2,3,4}));
    }
}


class Solution3 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums)
        {
            if(!numSet.add(num))
                return true;
        }
        return false;
    }

}