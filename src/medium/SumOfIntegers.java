package medium;
//https://leetcode.com/problems/sum-of-two-integers/
public class SumOfIntegers {
    public static void main(String[] args) {
        System.out.println(Solution11.getSum(2,3));
    }
}



class Solution11 {
    public static int getSum(int a, int b) {
        while(b!=0)
        {
            int temp= (a & b) << 1;
            a= a ^ b;
            b=temp;
        }
    return a;
    }
}