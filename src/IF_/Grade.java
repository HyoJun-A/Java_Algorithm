package IF_;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A >= 90 && A <= 100) {
            System.out.print("A");
        } else if (A >= 80 && A <= 89) {
            System.out.println("B");
        } else if (A >= 70 && A <= 79) {
            System.out.print("C");
        } else if (A >= 60 && A <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}
