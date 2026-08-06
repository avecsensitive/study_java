package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {


        //증감연산자
        //1씩 증가시키거나 1씩 감소시키는 연산자
        //선행증감과 후행증감의 차이를 알고있어야 한다
        int a = 10;
        System.out.println("a :" + ++a);  //선행으로 증감시킴

        int b =10;
        System.out.println("b : " + b++); //출력후 마지막으로 증감시킴
        System.out.println(b);

        b++;
        ++b;
        --b;
        b--;
        --b;
        b++;
        --b;
        b++;
        System.out.println(++b);
        


    }

}
