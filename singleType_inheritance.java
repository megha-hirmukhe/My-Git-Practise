import org.w3c.dom.css.CSS2Properties;

import java.util.Scanner;
public class singleType_inheritance {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter color: ");
        String color= sc.next();
        System.out.println("enter name: ");
        String name= sc.next();
        System.out.println("enter age: ");
        int age= sc.nextInt();
        System.out.println("enter cls: ");
        String cls= sc.next();
        System.out.println("enter div: ");
        String div= sc.next();

        human t= new human();
        t.obj1(color,name,age);


        student t2= new student();
        t2.obj2(cls,div);
    }
}

class human{

    void obj1(String color, String name, int age){
        System.out.println("hello I am human my color is: "+ color+ " and name is: "+ name+ " and age is:"+ age);
    }

}
class student extends human{
    void obj2(String cls , String div){
        System.out.println("student is studying in class:"+ cls+ " and his division is: "+ div);
    }

}

