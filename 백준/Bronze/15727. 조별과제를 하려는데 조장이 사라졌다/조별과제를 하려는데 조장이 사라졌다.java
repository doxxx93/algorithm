import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        if (l % 5 == 0) {
            System.out.println(l / 5);
        } else {
            System.out.println(l / 5 + 1);
        }
    }
}
