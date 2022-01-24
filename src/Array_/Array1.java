package Array_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 리스트 array
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // N개의 정수만큼 숫자가 들어오기 때문에 for문을 사용해서 반복
        // 반복하여 들어온 숫자를 리스트에 넣어줌
        for (int i = 0; i < N; ++i) {
            int x = sc.nextInt();
            arr.add(i, x);
        }
        // arr을 정렬
        Collections.sort(arr);
        // arr.get()은 리스트를 출력
        System.out.println(arr.get(0) + " " + arr.get(N - 1));
        sc.close();
    }
}
