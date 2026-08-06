package ex4_operator;

public class Ex3_oper {

    // 논리연산자
    //  비교연산자를 통한 연산이 2개 이상일 때 연결해주는 연산자
    public static void main(String[] args) {
        int age = 30;
        int limit = 35;
        boolean res = (limit - age) > 5 && age > 30;
        System.out.println("&& :=" + res);
        System.out.println("age : " + age);
        // &&(and)연산자
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // ||(or)연산자
        int i1 = 10;
        int i2 = 20;
        //or 연산은 앞쪽연산이 참이면 뒤쪽연산을 수행하지 않는다
        //false|| false = false
        //true || fales = true
        //false || true = true
        //false || false = true
        res = (i1 += 10) > 20 || i2 - 10 == 11;
        System.out.println("res : " +res);

        //(!)not연산자
        //참을 거짓을로 거짓을 참으로 변경하는 연산자
        System.out.println("1연산자 :" +!res);

        res = !res; //영구적으로 바꾸는 법
        System.out.println(res);


    }
}
