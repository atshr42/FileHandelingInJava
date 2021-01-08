
package pkg1.pkg4.pkg5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String line;
       PrintWriter out = null;
       out = new PrintWriter(new FileWriter("destination.txt"));
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the texts and write 'Quit' when you want to stop");
       while(true){
        line = in.nextLine();
        if(line.equalsIgnoreCase("Quit")) break;
        out.println(line);
       }
       out.close();
    }
    
}
