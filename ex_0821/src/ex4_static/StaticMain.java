package ex4_static;

public interface StaticMain {

    int n;
    static String str;

    public void test1(){
        n = 10;
        str = "안녕";
        
    }

    public static void test2(){
        //static 메서드에서느느
        //일반 변수의 참조가 불가능하다.
        //n = 10;
        str= "안녕";
        int num2 =100;

        //static 매서드 안에서느느
        //static 변수를 정의할 수 없다
        //static int num2 = 200;
    }



}
