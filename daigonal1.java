import java.net.SocketPermission;
import java.util.*;

public class daigonal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of rows:");
        int a = sc.nextInt();
        System.out.println("enter the no of col: ");
        int b = sc.nextInt();
        int daigonal = 0;
        // make a matrix:
        int[][] mymatrix = new int[a][b];
        // insert the values in matrix
        for (int i = 0; i < mymatrix.length; i++) {
            for (int j = 0; j < mymatrix.length; j++) {
                System.out.println("enter the elemet: ");
                mymatrix[i][j] = sc.nextInt();
            }

        }
        // // check how matrix looks:
        // for (int i = 0; i < mymatrix.length; i++) {
        // for (int j = 0; j < mymatrix.length; j++) {
        // System.out.print(mymatrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        // make daigonal element equal to 1:

        for (int i = 0; i < mymatrix.length; i++) {
            for (int j = 0; j < mymatrix.length; j++) {
                if (i == j) {
                    mymatrix[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < mymatrix.length; i++) {
            for (int j = 0; j < mymatrix.length; j++) {
                System.out.print(mymatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
