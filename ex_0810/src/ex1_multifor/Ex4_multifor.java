package ex1_multifor;

public class Ex4_multifor {

    public static void main(String[] args) {

        // *****
        // 12345
        // *****
        // 12345
        // *****

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }

            } // inner

            System.out.println();
        } // outer

    }// main
}
