package Algorith;

/**
 * 给定一个含有 n个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 */
public class SlidingWindowAlgorith {
    public static int solution(int target, int[] nums){
        if (nums.length <= 0){
            return 0;
        }

        //min最小长度
        int end = 1;
        int sum = nums[0];
        int min = Integer.MAX_VALUE;
        for (int pos = 0; pos < nums.length; pos++){
            while (end < nums.length){
                if (sum < target){
                    sum = sum + nums[end];
                    end++;
                }else {
                    break;
                }
            }

            if (sum >= target){
                min = (end - pos) < min ? (end - pos) : min;
            }

            sum -= nums[pos];
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args){
        int[] a = {2,3,1,2,4,3};
        System.out.println(solution(7, a));
    }
}
