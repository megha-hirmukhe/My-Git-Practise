import java.util.Scanner;
public class multilevel_inheritance {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        String size = sc.next();
        System.out.println("enter color");
        String color = sc.next();
        System.out.println("enter name");
        String name= sc.next();
        System.out.println("enter age");
        int age= sc.nextInt();
        System.out.println("enter fav_meal of cat");
        String fav_meal= sc.next();

        animal t= new animal();
        t.property(size,color);
        dog t2= new dog();
        t2.property2(name,age);
        cat t3= new cat();
        t3.property3(fav_meal);


    }
}
class animal{
    void property(String size,String color){
        System.out.println("size of animal is: "+ size+ " and color is: "+ color);
    }
}
class dog extends animal{
    void property2(String name, int age){
        System.out.println("name of dog is: "+ name+ "  and age of dog is: "+ age);
    }
}
class cat extends dog{
    void property3(String fav_meal){
        System.out.println("fav meal of cat is: "+ fav_meal);
    }
}
