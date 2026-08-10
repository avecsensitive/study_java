package ex1_multifor;

public class Ex3_multifor {
    public static void main(String[] args) {

        // A B C D
        // E F G H
        // I J K L

        char ch = 'A';

        for (int i = 1; i <= 3; i++) {
            System.out.print(ch++ + " ");

        } // inner

        for ( int j = 1; j <= 4; j++) {

            System.out.println();

        } // outer

    }// main
}
