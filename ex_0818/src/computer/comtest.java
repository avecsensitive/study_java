package computer;

public class comtest {

        String brand = "samsung";
        int ssd = 512;
        int ram = 564;
        float cpu = 1.8f;
        String color = "white";

        // metod(함수)
        // 메서드:어떤 작업을 수행하기 위한 명령문들의 집합
        // 메서드를 사용하면 반복적인 코드의 재활용이 편해진다
        public void info(){
              System.out.println("브랜드" + brand);
              System.out.println("ssd:"+ ssd);
              System.out.println("ram :" +ram);
              System.out.println("cpu :"+ cpu);
              System.out.println("color:"+ color);
              System.out.println("----------------");


        }

}
