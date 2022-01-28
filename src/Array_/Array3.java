package Array_;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // a * b * c를 한 값을 문자열로 변환하여 각 숫자를 카운트
        String result = String.valueOf(a * b * c);
        // 0~9까지의 숫자가 몇개 들어가 있는지 확인하기 위하여 리스트 사용
        int[] arr = new int[10];

        for (int i = 0; i < result.length(); ++i) {
            // 0~9까지의 숫자를 하나씩 비교하기위하여 for문을 한번더 사용
            // 48을 기준으로 사용하는 이유는 아스키코드 48이 '0'이기 떄문
            for (int j = 48; j < 58; j++) {
                if (result.charAt(i) == j) {
                    arr[j - 48]++;
                }
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

// 문제
// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는
// 프로그램을 작성하시오.

// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이
// 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

// 출력
// 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
// 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.