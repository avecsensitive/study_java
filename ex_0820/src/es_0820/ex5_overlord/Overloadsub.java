package es_0820.ex5_overlord;

public class Overloadsub {
    
    public static void main(String[] args) {
     
        Oversub os = new oversub;
        
        public void result(String s){
            System.out.println( "문자열을 인자로 받은 메서드");
        }

        public void result(int n, String s){
            System.out.println("정수, 문자열을 인자로 받는 메서드");

        }
        
        public void result(String s,int n)
            System.out.println("문자열, 정수를 인자로 받는 메서드");



    }
}
