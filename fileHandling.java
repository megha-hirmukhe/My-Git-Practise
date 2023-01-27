import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args){

        //create a file
        File myfile = new File("hello.txt");
        try{
            myfile.createNewFile();
        }catch( Exception e){
            System.out.println("error");
            e.printStackTrace();
        }


        // //code to write in file
        try{
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write("this is our first file");
            fileWriter.close();


        }catch( Exception e){
            System.out.println("throws exception");
        }

        //code to read from file
        File myFile2 = new File("hello.txt");
        try{
            Scanner sc= new Scanner(myFile2);
            while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
            }

        }
      
        catch( Exception e){
            System.out.println("error occured");
        }
       


        
        



       
        

       
    }
    
}
