import org.w3c.dom.css.CSSStyleDeclaration;

import java.lang.Runnable;
import java.util.Arrays;
import java.util.Scanner;
class threading_practise implements Runnable {
    public void run(){
        //task to perform
        Scanner sc= new Scanner(System.in);
        int min=0;
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int[] myarray= new int[size];
        //enter elements in array:
        System.out.println("enter elements: ");
        for(int i=0;i<size;i++){
            myarray[i]= sc.nextInt();
        }
        System.out.println("myarray is: ");
        for(int i=0;i<size;i++){
            System.out.print(myarray[i]+" ");
        }
        System.out.println();
        Arrays.sort(myarray);
        System.out.println("after sorting myarray is: ");
        for(int i=0;i<size;i++){
            System.out.print(myarray[i]+" ");
        }
        System.out.println();
        System.out.println(myarray[1]+" is the second smallest number from given array.");


    }

    public static void main(String[] args){
        threading_practise tp= new threading_practise();
        //maker helper object
        Thread th= new Thread(tp);
        th.start();
    }





}

