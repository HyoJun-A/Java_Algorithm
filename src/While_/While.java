package While_;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }
        sc.close();
    }
}

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.