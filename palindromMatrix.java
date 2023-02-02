//que: make a string matrix output will be which strings are palindrome
import java.util.*;

import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
public class palindromMatrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row: ");
        int row= sc.nextInt();
        System.out.println("enter col: ");
        int col= sc.nextInt();
        
        String empty=" ";
        String empty2= " ";
        
        String[][] myArray= new String[row][col]; //create a matrix

        for(int i=0;i<row;i++){     //insert the elements in matrix
            for(int j=0;j<col;j++){
                myArray[i][j]=sc.next();

            }
        }

        //to see the output
        System.out.println("matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(myArray[i][j]+ " ");
            }System.out.println();
        }

        //check input is palindrom or not if is print it
        System.out.println("palindrome are");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                empty= myArray[i][j];
                for(int k=0;k<empty.length();k++){
                    empty2= empty.charAt(k)+empty2;
                    
                }
                if(empty.equals(empty2)){
                    System.out.println(empty);
                }
                empty="";
                empty2="";
                continue;
        
            
            }
            
        
            
        }
        
        
        
}
}

        
           
        
        
        
        
        
        
    

    
        
        
        

       

        
        























    
    

