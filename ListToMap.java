import java.util.*;

public class ListToMap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //create a list
        List<Character> l = new ArrayList<>();
        System.out.println("enter size of char array: ");
        int size = sc.nextInt();

        char[] array = new char[size];
        for(int i=0;i<array.length;i++){
            array[i]= sc.next().charAt(0);
            l.add(array[i]);
        }

        Map <Character, Boolean> m= new HashMap<>();
        for(int i=0;i<l.size();i++){
            if(Collections.frequency(l,l.get(i))>=2){
                m.put(l.get(i), true);

            }
            else {
                m.put(l.get(i), false);

            }
        }
        System.out.println(m);







        }


}
