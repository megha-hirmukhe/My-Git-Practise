import java.util.Scanner;

class overriding {
    public void obj1(int b){
        System.out.println("given integer is: "+ b);
    }

}
class overriding2{
    public void obj1(String name){
        System.out.println("name of person is: "+ name);
    }
}
class overriding3{
    protected void obj1(float a){
        System.out.println("given float value is: "+ a);
    }
}

//main class
public class mainClass1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter int b: ");
        int b= sc.nextInt();
        System.out.println("enter name: ");
        String name= sc.next();
        System.out.println("enter float value: ");
        float a= sc.nextFloat();

        //obj of class
        overriding t1= new overriding();
        t1.obj1(b);

        overriding2 t2= new overriding2();
        t2.obj1(name);

        overriding3 t3= new overriding3();
        t3.obj1(a);





    }
}

