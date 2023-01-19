import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.println("enter the second string: ");
        String str2 = sc.nextLine();
        // create a array of type char
        char[] array1 = new char[str1.length()];
        char[] array2 = new char[str2.length()];

        String empty = "";
        String empty2 = "";

        if (str1.length() == str2.length()) {
            // convert str1 and str2 in array
            for (int i = 0; i < str1.length(); i++) {
                array1[i] = str1.charAt(i); // one by one all the elements entered in array

            }
            for (int j = 0; j < str2.length(); j++) {
                array2[j] = str2.charAt(j);
            }

            // sort this two arrays:
            Arrays.sort(array1);
            Arrays.sort(array2);

            // convert this two array in string
            for (int i = 0; i < str1.length(); i++) {
                empty = array1[i] + empty;
            }
            for (int j = 0; j < str2.length(); j++) {
                empty2 = array2[j] + empty2;
            }

            // compare these two strings
            if (empty.equalsIgnoreCase(empty2)) {
                System.out.println("it is anagram");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("cant print above steps: ");
        }
    }

}
