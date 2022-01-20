package For_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For4 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; ++i) {
            System.out.println(i + 1);
        }
    }
}
// Test Case T가 주어 졌을떄 1~T까지의 숫자를 출력하는 문제