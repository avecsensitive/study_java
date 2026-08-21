package ex6_work;

import java.util.Scanner;

public class Grademain {
    public static void main(String[] args) {
        
        //--등급기준
        //vip->구매 금액의 10%
        //gold ->5%
        //silver -> 3%
        
        //키보드에서 구매금액과 등급을 입력받아 적립포인트 계산
        //----------------------------
        //구매금액 : 10000
        //등급 : vip
        //적립포인트 : 1000

        //구매금액 : 1000
        //등급 0000
        //회원등급이 올바르지 않습니다
        //직접포인트 :0


        Scanner sc = new Scanner(System.in);
        System.out.print("구매금액 : " );
        int price = sc.nextInt();

        System.out.println("회원등급 :" );
        String grade =sc.next();

        Gradesub gs = new Gradesub();
        int res = gs.myPoint(grade, price);

        System.out.println("직접포인드 : " + res);


    }//main
}
