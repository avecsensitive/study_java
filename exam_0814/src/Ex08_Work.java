import java.util.Random;

public class Ex08_Work {
    public static void main(String[] args) {

        int[] lotto = new int[6];

        outer: for (int i = 0; i < lotto.length;) {

            lotto[i] = new Random().nextInt(6) + 1;

            for (int j = 0; j < i; j++) {

                if (lotto[i] == lotto[j]) {
                    continue outer;
                } // if

            } // inner
                System.out.print(lotto[i]+ " ");
                i++;
        } // outer


    }// main

}