package Array_;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int T = A * B * C;
        String str = String.valueOf(T);

        int num = 0;

        for (int i = 0; i < str.length(); ++i) {
            String t = String.valueOf(i);
            for (int j = 0; j < str.length(); ++j) {
                if (str.contains(t)) {
                    num = num + 1;
                }
            }
            System.out.println(num);
        }
        sc.close();
    }
}
