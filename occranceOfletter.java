import java.net.SocketTimeoutException;
import java.util.*;

public class occranceOfletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string line: ");
        String str = sc.nextLine();

        int checkLength = str.length();
        System.out.println(checkLength);
        String removeA = str.replace("m", "");
        System.out.println(removeA.length());

        // to count the how much time the letter occred
        int finalcount = str.length() - removeA.length();
        System.out.println(finalcount);
    }

}
