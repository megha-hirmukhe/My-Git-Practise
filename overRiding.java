//Poymorphism type no 2] = method overriding(Run time polymorphism)
//rules: 1] name of 2 or more method should be same. 2] that method should be in different class . 3] we can pass same arguments in that method.4] Inheritance concept should be satisfied.
//      5] number of arguments, sequence of arguments within the method should be same
import java.util.*;
class overRiding {     //class 1

    public static void myInput1(int a , int b){
        System.out.println("my two integer inputs are: "  + a + b  );
    }

    
} //donw with 1st class now create a new class 

class overRiding2 extends overRiding {     //inheritance concept used
    public static void myInput1(int a , int b){
        System.out.println("my second class inputs are: " + a +b);
    }


}
//we can multiple multiple object 

class overriding3 extends overRiding{
    public static void myinput1(int a , int b){
        System.out.println("my 3rd class inputs are: " + a + b);
    }

    //create a main class
    public static void main(string[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a: ");
        int a= sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();


        //to print wich class's object want to project create a new object for each class
        //lets create a object for first class overRiding
        
        overRiding show= new overRiding();
        show.myInput1(1, 2);

        //lets create a object for second class overRiding
        overRiding2 show2= new overRiding2();
        show2.myInput1(3, 4);

        //lets create a object for third class overRiding
        overriding3 show3 = new overriding3();
        show3.myinput1(5, 6);


          




    }
}



