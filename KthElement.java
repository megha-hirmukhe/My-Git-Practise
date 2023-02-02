import java.util.*;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        Arrays.sort(array);
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();

        System.out.println(array[array.length - k]); // for largest Kth no.
        System.out.println(k - 1); // for smalleat Kth no.

    }
}
