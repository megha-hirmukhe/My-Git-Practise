import java.util.Scanner;
public class encapsulation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name of capsule.");
        String capsule_name= sc.next();

        //create a object
        capsule c = new capsule();
        c.setName(capsule_name);
        System.out.println("name of the capsule is: "+ c.getName());


    }
}
class capsule{
    //private variable
    private String name;

    //to change value of variable use getter and setter
    public void setName(String capsule_name){
        name= capsule_name;
    }

    //to see the stored element use getter
    public String getName(){
        return name;
    }


}