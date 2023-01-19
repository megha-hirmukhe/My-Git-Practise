import java.util.*;

import javax.lang.model.element.Element;
import javax.swing.plaf.multi.MultiButtonUI;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int count = 0;
        int maxcount = 0;
        int element = 0;

        int[] myarray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the elements: ");
            myarray[i] = sc.nextInt();

        }

        // count

        for (int i = 0; i < n; i++) {
            count = 1;

            for (int j = i + 1; j < n; j++) {
                if (myarray[i] == myarray[j]) {
                    count = count + 1;
                    if (maxcount < count) {
                        maxcount = count;
                        element = myarray[i];

                    }

                }
            }

        }
        System.out.println("maximum count is: " + maxcount);

    }
}