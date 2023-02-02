
//que: convert row into column and column into row
import java.util.*;

import javax.sound.midi.VoiceStatus;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows: ");
        int row = sc.nextInt();
        System.out.println("enter the col: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("my outputis: ");

        // convert row into col and col into row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");

            }
            System.out.println();
        }
    }

}
