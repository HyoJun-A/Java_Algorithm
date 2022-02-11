package Array_;

import java.util.ArrayList;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < T + 1; ++i) {
            int t = sc.nextInt();
            for (int j = 0; j < t; ++j) {
                int n = sc.nextInt();
                list.add(n);
                sum += list.get(j);
            }

            for (int k = 0; k < list.size(); ++i) {
                if (sum < list.get(k)) {
                    cnt++;
                }
            }

            String p = String.format("%.3f", 100 / (list.get(i) / cnt));
            result.add(p);

            list.clear();
            cnt = 0;
            sum = 0;
        }

        for (int i = 0; i < T; ++i) {
            System.out.println(result.get(i));
        }
    }
}
