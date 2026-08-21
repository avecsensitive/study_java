package ex11_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        //정답 :pear
        //>>eealop
        //ealpp : 오답
        //>>apple 
        //apple 정답!!

       
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값 :" );
        String str = sc.next();

        String[] strArr = {"apple", "orange", "hope", "view"};
        System.out.println();

   
            outer:for( String word = strArr ; [str] != "입력값 : "; ){
                System.out.println("false : ");
                    return;
            }else{
                System.out.println("true :");
                    break:outer
            }//for

    }//main
    
}
