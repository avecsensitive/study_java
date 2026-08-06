package ex1_statement;
public class Ex1_If {
    public static void main(String[] args) {

        // 제어문 - 프로그램의 흐름을 제어하는 문장 (Control statements that manage the flow of a program)
        // 분기문과 반복문으로 나뉜다 (Divided into branch and loop statements)
        // 분기문 : if, switch (Branch: if, switch)
        // 반복문 : for, while, do-while (Loop: for, while, do-while)

        // if문 (if statement)
        // if(조건식) { 조건식이 참일 때 실행되는 영역 } (if (condition) { executed area when condition is true })

        // String은 쌍따옴표 안에 여러글자(문자열)를 저장하기 위한 자료형
        // (String is a data type used to store multiple characters (strings) within double quotes)
        String str = ""; // 문자열을 저장할 변수 선언 및 초기화 (Declare and initialize a variable to store a string)

        int n = 49;      // 정수형 변수 n을 49로 초기화 (Initialize integer variable n to 49)

        // n의 값에 따라 str에 저장할 문자열을 결정 (Set the string value for str depending on the value of n)
        if (n == 50) { // n이 50과 같으면 (If n is equal to 50)
            str = "n은 50아닙니다"; // 해당 문자열 저장 (Store corresponding message)
        }

        if (n != 50) { // n이 50이 아니면 (If n is not equal to 50)
            str = "n은 50입니다"; // 해당 문자열 저장 (Store corresponding message)

            // str 변수의 값을 출력 (Print the value of str variable)
            System.out.println(str);
        }

    }
}
