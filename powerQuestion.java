import java.util.*;

public class powerQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = sc.nextFloat();
        System.out.println("enter b: ");
        double b = sc.nextFloat();
        double ans= double pow(a,b);
        
        System.out.println(Math.pow(a, b));
    }

}
