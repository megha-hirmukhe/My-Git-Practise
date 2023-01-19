import java.util.*;

public class addrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter col: ");
        int col = sc.nextInt();

        int max = 0;
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];// row sum
            }
            if (max < sum)
                max = sum;
        }
        System.out.println(max);
    }
}
