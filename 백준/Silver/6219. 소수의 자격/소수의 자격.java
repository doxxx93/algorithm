import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int answer = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                int temp = i;

                while (temp != 0) {
                    if (temp % 10 == d) {
                        answer++;
                        break;
                    }
                    temp /= 10;
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}