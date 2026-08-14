package ex1_work;

import java.util.Random;
import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {

        // 세자리 수를 입력하세요(예123) -123
        // 1strike, 1ball
        // ---------------
        // 세자리 수를 입력하세요(예123) -567
        // out!!
        // --------------
        // 세자리 수를 입력하세요 -214
        // 0strike, 3ball
        // -------------------
        // 세자리 수를 입력하세요 -142
        // 3회 정답 !! -142

        Scanner sc = new Scanner(System.in);
        String pitch = "pitch1, pitch2, pitch3";
        System.out.print("투구: ");
        int pitch1 = sc.nextInt();
        int pitch2 = sc.nextInt();
        int pitch3 = sc.nextInt();

        int n = 1;
        out: for (int i = 1; i < 10; i++) {
            for (int j = 1; i <= 3;) {
                pitch1 = new Random().nextInt(j + 1);
                pitch2 = new Random().nextInt(j + 1);
                pitch3 = new Random().nextInt(j + 1);
                System.out.printf("%d,%d,%d", pitch1, pitch2, pitch3);
                break out;
            } // inner
        } // outer

    }// main
}
