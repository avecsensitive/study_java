public class Ex01_Work {
    public static void main(String[] args) {
       
        //과수원이 있다
        //배, 사과, 오렌지를 키우고 있는ㄴ데, 하루에 생산되는 양이
        //각각 5, 7, 5 개.
        
        //1.과수원에서 하루에 생산되는 과일의 총 갯수 출력
        //2. 시간당 전체 과일의 평균 생산 갯수
        //3. 단 과일의 갯수를 답는 변수는 int, 평균을 계산할 때 변수는 floeat

        int pear = 5;
        int apple = 7;
        int orang = 5;
        
        int total = pear + apple + orang;                
        float avg = total;
        float day = total/ 24f;
        
        System.out.println("하루 생산량 : " + total);
        System.out.println("%f시간당 평균 : " + day);

    }//main
}
