package ex6_work;

import java.util.Scanner;

public class Ex1_Work {
    public static void main(String[] args) {

        // 1 부터 100 숫자 중에서
        // 키보드에서 입력받은 수 보다 큰 첫번 째
        // 3의 배수를 찾아 출력
        // ---------------
        // 입력 :55
        // 55보다 큰 첫번 쨰 3의 배수 : 57

        Scanner sc = new Scanner(System.in);
        System.out.println("입력: ");
        int num = sc.nextInt();

        for (int i = num + 1; i <= 100; i++) {

            if (i % 3 == 0) {

                System.out.printf("%d보다 큰 첫번째 3의 배수 : %d", num, i);

                break;

            } // if
            System.out.println();
        } // for
    } // main
}
