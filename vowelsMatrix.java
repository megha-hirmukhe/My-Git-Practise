//que:make 4by4 matrix replace vowels with 'x'
import java.util.*;
public class vowelsMatrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row: ");
        int row= sc.nextInt();
        System.out.println("enter col:");
        int col= sc.nextInt();
        char [][] matrix= new char[row][col];
       
       
        
        
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix.length;n++){
                
                matrix[m][n]=sc.next().charAt(0);
            }
        }
        
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix.length;n++){
                if(matrix[m][n]=='a' || matrix[m][n]=='e'||matrix[m][n]=='i'||matrix[m][n]=='o'||matrix[m][n]=='u' ){
                    matrix[m][n]='x';
                }

            }
        }for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix.length;n++){
                System.out.print(matrix[m][n]+" ");
            }System.out.println();
        }
        
    }
    
}
