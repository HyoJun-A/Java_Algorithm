package input_output;

import java.util.Scanner;

public class multiply2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int Hundred = (B % 10) * A;
        int ten = ((B % 100) / 10) * A;
        int one = (B / 100) * A;
        int multi = A * B;

        System.out.println(Hundred);
        System.out.println(ten);
        System.out.println(one);
        System.out.println(multi);

        sc.close();
    }
}
