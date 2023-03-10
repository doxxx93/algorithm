import java.util.*;

class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] dp = new Set[9];
        for (int i = 1; i <= 8; i++) {
            dp[i] = new TreeSet<>();
        }
        for(int i =1; i<=8; i++){
            dp[i].add(Integer.parseInt(Integer.toString(N).repeat(i)));
        }
        for(int i =1; i<=8; i++){
            for(int j =1; j<i; j++){
                for(int k : dp[j]){
                    for(int l : dp[i-j]){
                        dp[i].add(k + l);
                        dp[i].add(k - l);
                        dp[i].add(k * l);
                        if(l != 0){
                            dp[i].add(k / l);
                        }
                    }
                }
            }
        }
        int answer = -1;
        for(int i =1; i<=8; i++){
            if(dp[i].contains(number)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
