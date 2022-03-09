package easy;
//https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(Solution12.hammingWeight(5));
    }
}


class Solution12 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int res=0;
        while(n !=0)
        {
            n= n & (n-1);
            res++;
        }
        return res;
    }
}