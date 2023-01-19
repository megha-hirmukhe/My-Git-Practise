//que: add col print max sum of column 
import java.util.*;
public class addCol {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row: ");
        int row= sc.nextInt();
        System.out.println("enter col: ");
        int col = sc.nextInt();
        int sum=0;
        int max=0;
        int[][] matrix= new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
        for(int i=0;i<matrix.length;i++){
            sum=0;
            for(int j=0;j<matrix.length;j++){
                sum= sum+matrix[j][i];
                
            }
            if(max<sum){
                max=sum;
                continue;

            }

            
            
        }System.out.println("max sum of col of given matrix is: " +max);
        
        
    }

    
}
