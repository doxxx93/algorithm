import static java.lang.Integer.parseInt;

class Solution {
    public int solution(String s) {
        String res = replaceZero(s);
        int answer = parseInt(res);
        return answer;
    }
/*method replace String "zero" to 0, "one" to 1 ... "nine" to 9*/
    public String replaceZero(String s) {
        String res = s.replace("zero", "0");
        res = res.replace("one", "1");
        res = res.replace("two", "2");
        res = res.replace("three", "3");
        res = res.replace("four", "4");
        res = res.replace("five", "5");
        res = res.replace("six", "6");
        res = res.replace("seven", "7");
        res = res.replace("eight", "8");
        res = res.replace("nine", "9");
        return res;
    }

}