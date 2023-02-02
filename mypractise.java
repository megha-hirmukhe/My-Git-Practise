import java.util.*;
import java.util.function.IntConsumer;

import javax.naming.directory.NoSuchAttributeException;

public class mypractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row= sc.nextInt();
        System.out.println("enter col: ");
        int col= sc.nextInt();
        int max=0;
        int sum=0;
        int[][] matrix = new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<matrix.length;i++){
            sum=0;
            for(int j=0;j<matrix.length;j++){
                sum=sum+matrix[i][j];
                max= sum;
                
            }
            
        }
        if(max<sum){
            System.out.println(max);
        }
        


        
    }
}
