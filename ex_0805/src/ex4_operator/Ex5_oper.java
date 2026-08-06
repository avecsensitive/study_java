package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {
        //삼항(조건)연산자
        //하나의 조건식을 통해 발생하는 결과를 원하는 타입으로 변활할 수 있도록 하는 연산자
        int a = 10;
        int b = 15;
        int res = ++a >= b ? 100 : 200;
        System.out.println("res : 2" + res);
        
        int n1=10;
        int n2 = 10;
        float res2 = (n1 += n1) == n2 ? 3.14f : 5.19f;
        System.out.println("res2 : " + res2);

        a = 10;
        b = 20;
        char res3 = ++a >= b|| (a -8) + 7 <= b && 13 -b >= 0 && (a+=b) - (a%b) > 10 ? '0' : 'X';
        //false || true            && true       && 
        System.out.println("res3 : " + res3);


    }   
}
