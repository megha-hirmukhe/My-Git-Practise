import java.util.Scanner;
class thread_class extends Thread {
    public void run(){
        //task to perform
        Scanner sc= new Scanner(System.in);
        int count=0,element=0,maxcount=0;
        System.out.println("enter size of char array: ");
        int size= sc.nextInt();
        char[] charArray = new char[size];
        System.out.println("enter characters in array: ");
        for(int i=0;i<size;i++){
            charArray[i]= sc.next().charAt(0);
        }
        System.out.println("char array is: ");
        for(int i=0;i<size;i++){
            System.out.print(charArray[i]+" ");
        }
        System.out.println();


        for(int i=0;i<size;i++){
            count=1;

            for(int j=i+1;j<size;j++){
                if(charArray[i]==charArray[j]){
                    count=count+1;
                    if (maxcount < count) {
                        maxcount = count;
                        element = charArray[i];

                    }


                }
            }
        }
        System.out.println("count is: "+ maxcount);


    }
    public static void main(String[] args){
        thread_class thc = new thread_class();
        thc.start();

    }

}
