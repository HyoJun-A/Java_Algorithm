package For_;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열 A의 총 갯수
        int X = sc.nextInt(); // A의 값들과 비교할 X

        // 수열 A를 넣기 위한 리스트
        int arr[] = new int[N];

        // for문을 돌려 arr[]안에 수열 값들을 넣는다.
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        // arr[]을 X와 비교하여 arr[i] 가 X보다 작을경우 arr[i]출력
        for (int i = 0; i < N; ++i) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
