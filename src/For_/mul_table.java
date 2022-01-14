package For_;

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < 10; ++i) {
            System.out.println(N + " * " + i + " = " + i * N);
        }

        sc.close();
    }
}
// 숫자 N이 주어 졌을 떄 간단한 구구단 출력