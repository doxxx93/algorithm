/*
첫 번째 집을 털 경우: dp[0], dp[1] = money[0];
첫 번째 집을 안 털 경우: dp[0] = 0, dp[1] = money[1];
*/

class Solution {
    public int solution(int[] money) {
        int n = money.length;
        
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        
        dp1[0] = money[0];
        dp1[1] = money[0];
        
        dp2[0] = 0;
        dp2[1] = money[1];
        
        for (int i = 2; i < n-1; i++){
            dp1[i] = Math.max(dp1[i-2] + money[i], dp1[i-1]);
        }
        
        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i-2] + money[i], dp2[i-1]);
        }
        
        return Math.max(dp1[n-2], dp2[n-1]);
    }
}