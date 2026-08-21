package ex3_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        
      /*
        1. 입금
        2. 출금
        3. 잔액확인
        ect 종료
        1 ->입금 1000원
        -------------
        1. 입금
        2. 출금
        3. 잔액확인
            잔액확인 1000
        ect. 종료
        
        */
    
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();

        while (true) {

            System.out.println("1. 입 금");
            System.out.println("2. 출 금");
            System.out.println("3. 잔 액");
            System.out.println("4. etc. 종료");
            System.out.print(">>");

            int select = sc.nextInt();
            int money = 0;


            switch (select) {
                case 1:
                    System.out.println("------입 금------");
                    System.out.print("입금: ");
                    money =sc.nextInt();
                    atm.deposit(money);
                    break;
                    
                case 2:
                    System.err.println("------출 금------");
                    System.out.println("출금액 : ");
                    money = sc.nextInt();
                    atm.withdraw(money);
                    break;
                case 3:
                    System.out.println("------잔액확인-----");
                    System.out.println(money);
                    break;
                    
                default:
                    System.out.println("atm 사용을 종료합니다");
                    break;
                   }

        }
    
    
    
    
    }// main

}
