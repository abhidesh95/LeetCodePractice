package easy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuySellStock {
    public static void main(String []a){
        System.out.println(Solution2.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(Solution2.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(Solution2.maxProfit(new int[]{1,4,2}));
        System.out.println(Solution2.maxProfit(new int[]{2,4,1}));
        System.out.println(Solution2.maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
}



class Solution2 {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minNum=prices[0];
        for(int i=1;i<prices.length;i++) {
            int iNum=prices[i];
            if(iNum<minNum)
            {
                minNum=iNum;
                continue;
            }
            maxProfit= Math.max(maxProfit,iNum-minNum) ;

        }
        return Math.max(maxProfit, 0);
    }
}
