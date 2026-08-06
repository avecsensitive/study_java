public class Ex1_Casting  {

    public static void main(String[] args){ 
    // 형변환
    // - 큰자료형에 작은 자료형을 대입하는 것

    double d1 = 100.5; //8byte
    int n1 = 200;  //4byte
    d1 = n1;
    System.out.println("d1 : " +d1);

    int n2 = 100;  //4byte
    char ch = 'A'; //2byte
    n2 = ch;
    System.out.println("n2 : " + n2);
    }
}