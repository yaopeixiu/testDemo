package Algorith;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数组 prices ，其中prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class MaxProfit2 {
    public static int maxProfit2(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
                result.add(maxprofit);
                maxprofit = 0;
            } else if ((prices[i] - minprice) >= maxprofit) {
                maxprofit = prices[i] - minprice;
                if (i == prices.length - 1){
                    result.add(maxprofit);
                }
            }else if ((prices[i] - minprice) < maxprofit){
                minprice = prices[i];
                result.add(maxprofit);
                maxprofit = 0;
            }
        }
        maxprofit = 0;
        for (int i : result){
            maxprofit = i + maxprofit;
        }
        return maxprofit;
    }

    /**
     * 贪心算法
     * 贪心算法的适用问题：所求问题的整体最优解，可以通过局部最优解得来。
     * 全局最优解不好找，把问题拆分成多个小问题（分而治之），分别求每个小问题的最优解，再把这些局部最优解叠起来，作为整个问题的最优解。
     */
    private static int maxProfit3(int[] prices) {
        int maxprofit = 0;
        int n = prices.length;
        for (int i=1; i<n; i++){
            //Math.max(a,b)返回a，b两个数中较大的一个
            maxprofit = maxprofit + Math.max(0, prices[i] - prices[i-1]);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {1,9,6,9,1,7,1,1,5,9,9,9};
        int result1 = maxProfit2(prices);
        int result2 = maxProfit3(prices);
        System.out.println(result1);
        System.out.println(result2);
    }
}
