package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {

        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02

        Scanner sc = new Scanner(System.in);
        System.out.print("입력값: ");
        int n = sc.nextInt();

        int arr[][] =new int [3][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int sum1 = (arr[i].length);
                int sum2 = (arr[j].length);
                
                
                System.out.print(arr[i][j] + " ");
            } // inner

            System.out.println();

        } // outer

    }// main
}
