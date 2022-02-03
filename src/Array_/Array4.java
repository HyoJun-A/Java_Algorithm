package Array_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 나머지를 구하기 위한 값은 무조건 10개가 들어간다고 선언되어 있기때문에 크기10의 배열을 생성 하여 나머지 값을 넣어줌
        int[] T = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();
            T[i] = A % 42;
        }

        // Set을 사용 하여 값을 넣어줌 , set은 중복을 포함하지 않기 때문에 사용
        Set<Integer> set = new HashSet<Integer>();
        for (int i : T)
            set.add(i);

        // 리스트에 넣지 않더라도 정렬을 할수 있으며 다양하게 사용할수 있기 때문에 사용
        List<Integer> list = new ArrayList<Integer>(set);

        System.out.println(list.size());
        sc.close();
    }
}

// 문제
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1,
// 2, 0, 2이다.

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// 출력
// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.