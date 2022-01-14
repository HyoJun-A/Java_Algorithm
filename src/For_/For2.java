package For_;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; ++i) {
            result = result + i;
        }
        System.out.println(result);
        sc.close();
    }
}
// 1부터 N까지의 합을 구하는 프로그램