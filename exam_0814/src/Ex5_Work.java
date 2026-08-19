import java.util.Scanner;

public class Ex5_Work {
    public static void main(String[] args) {
        
        //정수 n1, n2를 입력받고
        //n1 ~ n2 사이의 합을 출력
        //---------------
        // 수1 :2
        // 수2 :5
        //결과 :14

        //수 1 :5
        //수 2 :2
        //결과 :14

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt();

        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        
        int res =0;//결과 출력용 변수


        if( n1 > n2 ){
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }


        for(int i = n1; i <= n2; i ++){
            
            res += i;
            
            
        }//for

    
    
    }//main

}
