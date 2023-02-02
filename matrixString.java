//que: Take char matrix of 3by3 and take one string. If all the characters from string are present in matrix print true else print false
import java.util.*;
public class matrixString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row: ");
        int row= sc.nextInt();
        System.out.println("enter col: ");
        int col = sc.nextInt();
        boolean ans=false;
        
        char[][] charMatrix = new char[row][col];
        System.out.println("enter string");
        String str = sc.next();
       
        for(int i=0;i<charMatrix.length;i++){
            for(int j=0;j<charMatrix.length;j++){
                
            charMatrix[i][j]=sc.next().charAt(0);
            }
        }
        System.out.println("My char matrix is: ");

        for(int i=0;i<charMatrix.length;i++){
            for(int j=0;j<charMatrix.length;j++){
                System.out.print(charMatrix[i][j]+" ");
            }System.out.println();
        }

        

        char[] StrArray = new char[str.length()];

        for(int i=0;i<str.length();i++){
            StrArray[i]=str.charAt(i);
        }

        for(int i=0;i<StrArray.length;i++){
            for(int j=0;j<charMatrix.length;j++){
                for(int k=0;k<charMatrix.length;k++){
                if(charMatrix[j][k]==StrArray[i]){
                    ans=true;
                   
                }else{
                    ans=false;
                    break;
                }
            }
                }
            }
            System.out.println(ans);
            
        










    }
    
}
