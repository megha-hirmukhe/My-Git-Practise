//que: alter each two letter of string
import java.util.*;


public class alterLetter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        String str2= "";
        String ans="";


        for(int i=0;i<str.length();i+=2){
           
             
            str2="";
            
          
            for(int j=i;j<=i+1;j++){
                str2= str.charAt(j)+str2;
               
            }System.out.print(str2);
        } 

        
        
        
        
        
       
    }
    
}
