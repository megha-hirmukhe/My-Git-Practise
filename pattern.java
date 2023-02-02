import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = i; k >= 1; k--) {
                    System.out.print(j);
                }

            }
            System.out.println();
        }

        sc.close();
    }
}
