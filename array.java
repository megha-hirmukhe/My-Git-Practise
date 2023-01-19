import java.util.Scanner;

//que: multiply the array element one by one print max mulplication answer

import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        // create a array:
        int[] myarray = new int[n]; // this array is for store the number
        int[] answer = new int[n - 1]; // this array is for store the product of the 2-2 numbers

        // store the elements in array
        for (int i = 0; i < n; i++) {
            myarray[i] = sc.nextInt();
        }

        // to see the array output
        for (int i = 0; i < n; i++) {
            System.out.print(myarray[i] + " ");
        }

        // make multiplication of 2-2 numbers and store it in new array:
        int p = 0;
        for (int i = 0; i < n - 1; i++) {

            answer[i] = myarray[p] * myarray[p + 1];
            p++;

        }
        // check multiplication is printing or not
        for (int i = 0; i < n - 1; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();

        // find max from the product
        int max = answer[0];

        for (int i = 0; i < n - 1; i++) {

            if (max < answer[i]) {
                max = answer[i];
            }

        }
        System.out.println("max product is: " + max);

    }

}
