package ex6_work;

import java.util.Scanner;

public class Ex1_Work {
    public static void main(String[] args) {
        
        //정수 : 9
        //9는 소수가 아닙니다

        //정수 : 7
        //7은 소수입니다

        Scanner sc = new Scanner("정수 : " );
        System.out.println();
        int n =sc.nextInt();
 
        Worksub ws = new Worksub();
        boolean res =ws.isPrime(n);

        if (res)
            System.out.println(n + "은 소수");
        else
            System.out.println(n + "소수가 아닙니다");
        }//for

    }

