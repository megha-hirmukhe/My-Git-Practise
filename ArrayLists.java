import java.time.chrono.IsoChronology;
import java.util.*;

import javax.xml.transform.Source;
public class ArrayLists {
    public static void main(String[] args){
        // ArrayList <Integer> list = new ArrayList<Integer>();

        // //to add the elements in list
        // list.add(0);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);

        // //to get the elements
        // int element = list.get(1);
        // System.out.println("on the 1st position the element is: "+element);

        // //to add element in between
        // //syntax: list_name.add(position_number_on_which_have-to-add, number_which-want-to-add);
        // list.add(3,89);
        // System.out.println("now on 3rd position element will be: "+ list);


        // //set the element: to set the element in perticular place
        // //Synatx: list_name.add(index,element);
        // list.set(0, 34);
        // System.out.println("now the list will be: "+ list);


        // //delete element: to delete the particular element from particular place
        // list.remove(0);
        // System.out.println("now it will remove 0th position's element: "+list);


        // //or to remove something we can use second method
        // list.remove(Integer.valueOf(89));
        // System.out.println("after removing 89 the list will be: "+list);

        // //to count the size of given arrayList
        // int arraySize= list.size();
        // System.out.println("size of given array is: "+arraySize);

        // //loops
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }System.out.println();


        // //sorting
        // Collections.sort(list);
        // System.out.println("after sorting the list will be: "+ list);

        // //to add new list in given list
        // //lets create a list which have to add in given list
        // ArrayList<Integer> newList= new ArrayList<Integer>();
        // newList.add(78);
        // newList.add(134);
        // newList.add(896);
        // list.addAll(newList);
        // System.out.println("after adding the new list in previous list output wil be: "+ list);

        // //to clear the list
        // // list.clear();
        // // System.out.println("list the empty now: "+list);


        // //to check the element is present or not
    
        // System.out.println(list.contains(134));   //if 134 is present in list it will print true else it will print false



        //ARRAYLIST
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(45);
        arrayList.add(34);
        arrayList.add(4);
        arrayList.add(40);
        arrayList.add(41);
        arrayList.add(34);
        System.out.println("my given array list is: " +arrayList);

        //to find the max number from given list
        System.out.println("min number from the given list is: "+ Collections.min(arrayList));
        System.out.println("max number from the given list is: "+ Collections.max(arrayList));

        //to count the how much numbers are present
        System.out.println("total number of element repeated in list is: "+ Collections.frequency(arrayList, 9)); //it will print how many times 9 is present

        System.out.println(Collections.frequency(arrayList,41));  //it will print how many times 41 is prsent



        //to sort the collection
        Collections.sort(arrayList);
        System.out.println("sorted array-list is: " +arrayList);

        //to sort the collection in reverse manner
        Collections.sort(arrayList,Comparator.reverseOrder());
        System.out.println("sorted collection in reverse manner: "+ arrayList);







        


    





     



    }
    
}
