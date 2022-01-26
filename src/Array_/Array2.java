package Array_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int k = 0;
        int Max = 0;

        for (int i = 0; i < 9; ++i) {
            int num = sc.nextInt();
            arr.add(i, num);

            if (Max < arr.get(i)) {
                Max = arr.get(i);
                k = i;
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(8) + "\n" + (k + 1));
        sc.close();
    }
}

// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

// 예를 들어, 서로 다른 9개의 자연수

// 3, 29, 38, 12, 57, 74, 40, 85, 61

// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.