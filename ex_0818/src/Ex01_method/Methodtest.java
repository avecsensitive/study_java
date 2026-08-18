package Ex01_method;

public class Methodtest {
    
    public void test(){
        System.out.println("test 메서드 호출");
    }


    public int test2 (int n){
        n +=100;
        System.out.println("결과 : " + n);
    
        //나를 호출한 곳으로 return 값을 딱 한개만 가지고 돌아간다.
        return n;
    }

}
