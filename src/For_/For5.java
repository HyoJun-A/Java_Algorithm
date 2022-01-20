package For_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For5 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            System.out.println(N - i);
        }
    }
}

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
// 만약 5가 주어질 경우 5 4 3 2 1 역순으로 출력