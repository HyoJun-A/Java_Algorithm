package For_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class For3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; ++i) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}

// 아래의 코드의 경우에는 시간이 오래 걸리기 떄문에 위에 본문의 코드로 작성해야 문제의 답을 시간에 맞게 찾을수 있습니다.
// Scanner sc = new Scanner(System.in);
// int T = sc.nextInt();

// for (int i = 0; i < T; ++i) {
// int A = sc.nextInt();
// int B = sc.nextInt();
// System.out.println(A + B);

// }
// sc.close();