import java.util.*;interface Main {static void main(String[]z){var s = new Scanner(System.in);int q = s.nextInt();var b = new StringBuilder();while (q-- > 0) {int x = s.nextInt();b.append(((x & (x - 1)) == 0 ? 1 : 0) + "\n");}System.out.print(b);}}