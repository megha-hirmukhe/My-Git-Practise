import java.net.SocketTimeoutException;
import java.util.Scanner;

//Encapsulation=> binding the data in single form:
//rules: 1]class should be public .2] variables inside the class should be private

class encapsulation {
    private int num;   //data hiding
  
    public void setValue(int x){  //data abstraction
        num=x;
    }
    public int getValue(){
        return ++num;
       
        

        
    }

    
}

class mainFunction{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num: ");
        int num= sc.nextInt();

        encapsulation show= new encapsulation();
        show.setValue(num);
        System.out.println("my getvalue will be: " +show.getValue());
       
    }
    

}

