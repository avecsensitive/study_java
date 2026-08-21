package ex10_work;

import java.util.Scanner;

public class Workmain {
    public static void main(String[] args) {
        
        //키보드에서 받은 홀수값에 대응하는 마방진 만들기
        //---------------------
        //홀수:
        //08 01 06
        //03 05 07
        //04 09 20


        Scanner sc = new Scanner(System.in);
        System.out.println("홀수 :" );
        int size.sc Scanner("");

    
       WorkSub ws = new WorkSub();
       int[][] res = ws.square(size);

        for (int i = 0; i < size; i++){

            for(int j= 0; j< size; j++){
                System.out.printf("%02d", res [i][j]);
                
            }//inner

                System.out.println();
        }//outer
            












    }//main
}
