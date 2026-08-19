import java.util.Scanner;

public class Ex02_Work {
    public static void main(String[] args) {
        
        //1 ~ 12 사이의 값을 키보드에 입력
        //입력된 값에 해당하는 달이 몇일까지 있는지 출력
        //-----------
        //월 :3
        //3월을 31일 까지 있습니다


        Scanner sc = new Scanner(System.in);
        System.out.print("월 ");
        int month = sc.nextInt( );

        switch (month) {
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                System.out.println(month + "월을 31일 까지");    
                                
                break;
            
            case 4:
            case 6:   
            case 9:
            case 11:    
                System.out.println("월은 30일 까지");
                break;
            
            default:
                System.out.println( month + "월은 없음");
                break;
            }

    
    }//main
}
