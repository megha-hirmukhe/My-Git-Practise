import java.util.jar.Attributes.Name;
import java.util.*;
import java.util.PrimitiveIterator.OfDouble;

import javax.xml.transform.Templates;

//Polymorphism: Means many form.
//type of polymorphism: 1] compile time(method overloading) 2] run time(method overriding)
//1]Method overloading: Rules=> 1]object should be in same class 2]arguments of each object shouldbe different 3]name of object should be same

//first rule object should be in same class
// class polymorphism {
//     //second rule create a object
//     //1] 1st object
//     public static void printMyInput(){
//         System.out.println("hello world");
//     }

//     //create how much object we want bt objectname should be same.in this case object name is printMyInput
//     //2] 2nd object
//     public static void printMyInput(int a){
//         System.out.println("my interger input is:" +a);
//     }
//     //3] 3rd object

//     public static void printMyInput(int age, String name ){
//         System.out.println("his name is: "+name+ " and his age is: "+age );
//     }


//     //now to call above create a main function
//     public static void main(String[] args){
//         //create a object
//         polymorphism myinput= new polymorphism();  //syntax to create a object in main function=> class_name object_name= new class_name();

//         //call whatever you want to print
//         myinput.printMyInput(); //it will create 1st print statement //syntax to call whichever object you want =>object_name.nameOfObject(which we have created in upper side(same name));
//         myinput.printMyInput(12); //it will print 2nd ;
//         myinput.printMyInput(23, "Tony"); // it will print 3rd
        

        
        
//     }
    

    
// }





//que: mathematical operation using polymorphism
// class oops1 {
    

//     //create a object
//     //1st
//     public static void oopsPractise1(int a , int b,int c){
//         int sum= a+b+c;
//         System.out.println("sum of a,b,c  is: " +sum);
//     }
// //2nd
//     public static void oopsPractise1(int a , int b){
//         int product= a*b;
//         System.out.println("product of a and b is: "+product);
        
        
        
//     }
// //3rd
//     public static void oops1(int  a, int b){
//         float division= a/b;
//         System.out.println("a divided by b is: "+division);
//     }

//     //create a main method
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a: ");
//         int a= sc.nextInt();
//         System.out.println("enter b: ");
//         int b= sc.nextInt();
//         System.out.println("enter c: ");
//         int c= sc.nextInt();
       

//         //create a object
//         oops1 ans= new oops1();

        
//         ans.oopsPractise1(a, b );  // for product
//         ans.oopsPractise1(a, b,c);  // for addition
//         ans.oopsPractise1(a,b);  // for division

       
        


//     }


    
// }



//que:cretae a class to print area of square and rectangle.
// class areas{
//     public static void xyz(int length ,int height){
//         float areaOfRectangle= length*height;
//         System.out.println("area of rectangle is: "+areaOfRectangle);
//     }

//     public static void xyz(int side){
//         float areaOfSquare= side*side;
//         System.out.println("area of square is: "+areaOfSquare);
//     }




   
    
// }




//que: overriding que:
class parentDetails{
    public static void details(String name,int age,String city){
        System.out.println("name of the person is: "+name + " age is=  "+age + " city is= " + city);
    }
}

class StudentDetails extends parentDetails{
    public static void details(String Class ,float marks){
        System.out.println("class of student is : "+Class + "marks is: "+marks);

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name: ");
        String name= sc.nextLine();
        System.out.println("enter age: ");
        int age= sc.nextInt();
        System.out.println("enter city: ");
        String city = sc.next();
        


        //method of parentDetails;
        parentDetails show= new parentDetails();
        show.details(name,age,city);

        System.out.println("enter class: ");
        String Class = sc.next();
        System.out.println("enter marks: ");
        float marks= sc.nextFloat();

        StudentDetails show2= new StudentDetails();
        show2.details(Class,marks);

    }
}








