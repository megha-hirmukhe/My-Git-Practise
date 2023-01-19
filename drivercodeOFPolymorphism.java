import java.util.*;
public class drivercodeOFPolymorphism {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter side: ");
        int side= sc.nextInt();
        System.out.println("enter length: ");
        int length= sc.nextInt();
        System.out.println("enter height: ");
        int height= sc.nextInt();

        areas show= new areas();
        show.xyz(side);
        show.xyz(length,height);

    }

    
}
