package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 2~9 사이의 값에 해당하는 
        //구구단을 출력
        //------------------
        //단 : 10
        //2~9사이의 값을 입력하세요

        //단 : 5
        //5*1 = 5
        //5*2 = 10
        //....
        //5*9 = 45

        Scanner sc = new Scanner(System.in);
        int dan = sc. nextInt();

        if ( dan <= 1 || dan >= 10){
            System.out.println("2~9 사이의 값을 넣으세요");
        }else{

            for ( int i = 1; 1 <= 9; i++ ){

                //System.out.println( dan + " * " + (dan * i ));
                System.out.printf("%d * %d = %02d\n", (dan*i));
            }//for
        }








    }//main
}
