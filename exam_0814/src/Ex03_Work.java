import java.util.Scanner;

public class Ex03_Work {
    public static void main(String[] args) {
        
        //수 1 : 10
        //수 2 : 20
        //연산자 : +
        // 10 + 20 =30

        Scanner sc = new Scanner(System.in);
        System.out.println("수1 : ");
        int su1 = sc.nextInt( );

        System.out.println("수2 : ");
        int su2 = sc.nextInt();

        System.out.println("연산자 : ");
        String (op) = sc.nextInt();

        switch (sc) {
            case "+":
                System.out.printf("%d + %d =%d\n", su1, su2, s1 + su2);
                break;
            caes "-":
                System.out.printf("%d - %d =%d\n", su1, su2, s1 - su2);
                break;
            case "*":
                System.out.printf("%d * %d =%d\n", su1, su2, s1 * su2);
                break;
            caes "/":       
                System.out.printf("%d / %d =%f\n", su1, su2, (float)s1 / su2);
                break;
        
            default:
                System.out.println("시스템오류" );
                break;
        }
        } 
           

            System.out.println( );
        


    }//main
}
