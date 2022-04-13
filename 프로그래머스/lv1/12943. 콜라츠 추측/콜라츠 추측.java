class Solution {

    public int solution(int num) {
        int count = 0;

        long n = (long) num;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }
        return (count >= 500) ? -1 : count;
    }
}