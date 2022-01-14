package For_;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test case의 갯수

        for (int i = 0; i < T; ++i) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);

        }

        sc.close();
    }
}
// T의 숫자가 주어지면 T의 숫자만큼 반복하여
// 받은 A ,B의 숫자를 더한 값을 보여주는 프로그램