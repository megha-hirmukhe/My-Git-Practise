
import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import javax.sound.sampled.SourceDataLine;
import javax.swing.text.html.FormSubmitEvent.MethodType;
//POLYMORPHISM//

//1]OVERLOADING
class day1OOPs {
    public static void method(){
        System.out.println("for first method.no arguments");
    }
    private static void method(int a){
        System.out.println("second method.have the value: "+ a);

    }
    protected static void method(int b,String str){
        System.out.println("third method.have the value:"+ b + str);
    }
    
    


// //main function
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a: ");
    int a= sc.nextInt();
    System.out.println("enter string str: ");
    String str = sc.next();
    System.out.println("enter b: ");
    int b= sc.nextInt();
   

    //create method to call
    day1OOPs t= new day1OOPs();
    t.method();
    t.method(a);
    t.method(b,str);
}
}


//2]OVERRIDING
class one{
    public static void method(int a , String str){
        System.out.println("a is: "+ a+ " and"+ " string is: "+str);
    }
}
class two extends one{
    public static void method(char ch){
        System.out.println("for 2nd method char is : "+ ch);
    }
}
class three extends two{
    protected void method(float f){
        System.out.println("for 3rd method value is: "+ f);
    }
}



//     //main method
    class main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter string: ");
        String str = sc.next();
        System.out.println("enter char: ");
        char ch= sc.next().charAt(0);
        System.out.println("enter float");
        float f= sc.nextFloat();
       

        //create a method for class one
        one obj1= new one();
        obj1.method(a, str);

        two obj2 = new two();
        obj2.method(ch);

        three obj3 = new three();
        obj3.method(f);

       
    }




    
}


//INHERITANCE....que=make a calculator
class calci{
    public void add(int a, int b){
        System.out.println("sum is: " +(a+b));
    }
}
class sub extends calci{
    public void substract(int a,int b){
        System.out.println("substraction is: "+ (a-b));
    }
}
class multi extends sub{
    public void mul(int a, int b){
        System.out.println("multiplication is: "+(a*b));
    }

}
class main1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a: ");
        int a= sc.nextInt();
        System.out.println("enter b: ");
        int b= sc.nextInt();
        multi objM= new multi();
        objM.add(a, b);
        objM.substract(a, b);
        objM.mul(a, b);
    }
}




//ENCAPSULATION
class encapsulation{
    private int age;
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
     
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }


}

class main2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age: ");
        int age = sc.nextInt();
        System.out.println("enter name: ");
        String name= sc.next();
       

        encapsulation e= new encapsulation();
        e.setName(name);
        e.setAge(age);
        System.out.println("name is: "+ e.getName());
        System.out.println("age is :"+ e.getAge());
       
    }
}

     


    














    





