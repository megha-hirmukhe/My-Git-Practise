import java.util.*;

public class ListToMap {
    public static void main(String[] args){
        //create a list
        List<Character> l = new ArrayList<>();
        l.add('a');
        l.add('a');
        l.add('b');
        l.add('c');
        l.add('d');
        l.add('c');
        //to print the list
//        System.out.println("given list is: "+ l);

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
