import java.util.*;
import java.lang.Runnable;
//created thread using runnable interface
public class threading1 implements Runnable {
    public void run(){
        //tasks for thread = add two matrix
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row for matrix1: ");
        int row1= sc.nextInt();
        System.out.println("enter col for matrix2: ");
        int col1= sc.nextInt();
        System.out.println("enter row of matrix2: ");
        int row2= sc.nextInt();
        System.out.println("enter col for matrix2: ");
        int col2= sc.nextInt();
        int[][] matrix1= new int[row1][col1];
        int[][] matrix2= new int[row2][col2];
        int[][] matrixSum = new int[row1][col2];
        //matrix1
        System.out.println("enter the elements in matrix1: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 1 is: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        //matrix2
        System.out.println("enter elements of matrix2: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                matrix2[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 2 is: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                matrixSum[i][j]= matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        threading1 t2= new threading1();
        Thread th = new Thread (t2);
        th.start();
    }
}
