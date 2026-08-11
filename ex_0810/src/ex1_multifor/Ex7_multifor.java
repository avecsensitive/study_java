package ex1_multifor;

public class Ex7_multifor {
    public static void main(String[] args) {

        // 2 x 1 =2 3 X 1 =3...........
        // ....
        // 9 x 1 =9 3 X 9 =27............
        
        for (int i = 1; i <= 9; i++) {

            for (int j = 2; j <= 9; j++) {
               
                System.out.printf("%d X %d = %d\t", j, i, (j*i));
                //System.out.printf("%d\t * %d\t = %d\t ", j, i, (i*j));
                //System.out.printf(j + "*" + i + "=" + (i*j) , %d );
                //System.out.print(str = "i X j =  ");

            } // inner

            System.out.println();

        } // outer

    }// main
}
