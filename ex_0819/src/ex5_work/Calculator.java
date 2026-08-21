package ex5_work;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // 수 1 : 5
        // 수2 : 10
        // 연산자 : +
        // 결과 : 15

        // 수 1 : 5
        // 수 2 : 10
        // 연산자 : a
        // 연산기호가 올바르지 않습니다
        // 결과 -1

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int su1 = sc.nextInt();

        System.out.println("수2 :");

        System.out.print("연산자: ");
        System.out.sc.nextInt();
        // -------------------------

        public void getResult(int su1, int su2, String op);

        switch (op) {
            case "+":
            //System.out.println(su1 + su2);
            return su1 +su2;
                break;

            case "-":
            //System.out.println(su1-su2);
            return su1 +su2;
                break;
                
            case"*":
            //System.out.println(su1*su2);
            return su1 + su2;  
                break;

            case"/":
            //System.out.println(su1/su2);
            return su1 +su2;
                break;
        
            default:
                System.out.println("연산기호가 올바르지 않습니다");
            return -1;
        
            }



                Calsub sc = new Calsub();
                cs.getResult (su1, su2, op);

    } // main
}