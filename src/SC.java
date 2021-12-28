import java.util.Scanner;

public class SC {

    public static void main(String[] args) {
        System.out.println("이름, 나이를 빈칸으로 분리 하여 입력해 주세요");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("이름은 " + name + " 입니다");

        int age = sc.nextInt();
        System.out.println("나이는 " + age + " 입니다.");
        sc.close();
    }
}
/*
 * Scanner를 이용한 키 입력 연습
 * 이름, 나이 입력 받아서 출력해주기
 */