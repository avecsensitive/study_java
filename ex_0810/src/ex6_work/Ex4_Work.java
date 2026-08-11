package ex6_work;

import java.util.Scanner;

public class Ex4_Work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 두 개의 수의 최대 공약수 출력
        // --------------
        // 수1 : 18
        // 수2 : 12
        // 최대공약수 : 6

        Scanner sc = new Scanner(System.in);
        System.out.print("수1: ");
        int 수1 = sc.nextInt();
        System.out.print("수2:");
        int 수2 = sc.nextInt();
        for (int i = 1; i >= 1; i++) {

            out: for (int j = 1; i >= 1; j++) {

                int res = i + j;

                if (res % i == 0 && res % j == 0) {

                } // if
                System.out.printf("%c최대공약수:%d,%d,%d",i, j, i*j);
                break;
            } // inner
            System.out.println();
        } // outer
    }// main
}
