
   import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Lecture23 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the name of teh file: ");
        String fnm = kb.nextLine();
        filePrint(fnm);
        fileReadPractice();
    }

    public static void filePrint(String fname){
        PrintWriter cats = null;
        try {
            //cats = new PrintWriter("cats");
            cats = new PrintWriter( fname );
        }
        catch (FileNotFoundException fnfErr){
            System.out.println("Could not open the file for reading: " + fname);
            return ;
        }
        cats.println("I changed my mind.");
        cats.print(3+5 + "  =" + 8);
        cats.printf("%s, you're %d years old", "Buddy", 77);
        cats.printf("%nsome more lines of text");
        cats.println("cats dogs mice");
                
        
        cats.close();
    }
    
    public static void fileReadPractice() {
        //File tempF = new File("toast.txt");
        Scanner inFile = null;
        try{
            //inFile = new Scanner(tempF);
            //inFile = new Scanner( new File("toast.txt") );
            
            inFile = new Scanner( new File("cats") );
            /*
            String text;
            text = "Alex";
            text = "Jane"; // text points to most recent object it was assigned to it
            System.out.println(text);
            */
            
            // Scanner kb = new Scanner(System.in);
        }
        catch(Exception e){
            System.out.println("Could not open file for reading.");
            //return; 
        } 
        /*
        String s = inFile.nextLine();
        //String s = kb.nextLine();
        System.out.println("I have read from the file this line: " + s);
        s = inFile.next();
        //int i = inFile.nextInt();
        System.out.println("The 2nd line is: " + s);
        s = inFile.next();
        System.out.println("The 3rd thing is: " + s);
        inFile = new Scanner("day night\nnoon summer\n junk");
        */
        String ln;
        while ( inFile.hasNextLine() ){
            ln = inFile.nextLine();
            System.out.println(ln);
        }
    }
    
}