
//Map is used to store the key-value pair.
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.INPUT_STREAM;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();
        number.put("one", 1);

        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        System.out.println(number);

        Map<String, Integer> num2 = new HashMap<>();
        num2.put("five", 5);
        num2.put("six", 6);
        num2.put("seven", 7);
        System.out.println("new map is: " + num2);

        Map<String, Integer> num3 = new HashMap<>();
        num2.put("Eight", 8);
        num2.put("nine", 9);
        num2.put("ten", 10);
        num2.put("eleven", 11);

        // HASHMAP

        HashMap<Integer, String> finalNum = new HashMap<>();
        finalNum.put(10, "Megha");
        finalNum.put(11, "Megha");
        finalNum.put(21, "Megha");
        finalNum.put(19, "Megha");
        System.out.println(finalNum);

        HashMap<Integer, String> finalNum2 = new HashMap<>();
        finalNum2.put(101, "Megha");
        finalNum2.put(102, "Neha");
        finalNum2.put(103, "Mansi");
        finalNum2.put(104, "Rekha");
        System.out.println(finalNum2);

        // to get particular value of key
        System.out.println(finalNum2.get(101));

        // to get all the keys from key-value pair
        System.out.println(finalNum2.keySet()); // it will print only keys from the key-value pair as set.

        // to get only values from key-value pair as a collection
        System.out.println(finalNum2.values()); // it will print all the values as collection.

    }

}
