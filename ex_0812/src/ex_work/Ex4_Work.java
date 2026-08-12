package ex_work;

import java.util.Scanner;

public class Ex4_Work {
    public static void main(String[] args) {
        
        /*
        *배열의 크기를 입력하세요 : 5
        *정수 1 : 6
        *정수 2 : 7
        *정수 3 : 11
        *정수 4 : 20
        *정수 5 : 31
        *------------
        홀수 갯수 : 3
        짝수 갯수 :2
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 : ");
        int size = sc.nextInt();

        int[] nums= new int [size];
        
        int odd = 0;//홀수
        int even = 0;//짝수

        for ( int i = 0; 1 < size; i++){

            System.out.printf("정수%d : ", i + 1 );
            nums[i] = sc.nextInt();

            if ( nums[i] % 2 ==0 ){
                even++;
            }else{
                odd++;
            }
        }//for
    
            System.out.println("짝수: " + even);
            System.out.println("홀수 :" + odd);
    
    
    
    
    
    
    
    
    
    
    }//main

}
