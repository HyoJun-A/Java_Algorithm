package input_output;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
        sc.close();
    }
}
/*
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 첫째 줄에 A+B를 출력한다.
 */