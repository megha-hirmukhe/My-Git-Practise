import java.util.Scanner;
class overloading {
    public static void obj() {
        System.out.println("hello");
    }

    public void obj(int a, String name) {
        System.out.println("integer is: " + a + " and name is: " + name);
    }

    protected void obj(int age) {
        System.out.println("age is: " + age);
    }
}

    //main method
    public class mainClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a: ");
            int a = sc.nextInt();
            System.out.println("enter name: ");
            String name = sc.next();
            System.out.println("enter age: ");
            int age = sc.nextInt();

            //object of class
            overloading t = new overloading();
            t.obj();
            t.obj(a, name);
            t.obj(age);


        }
    }

