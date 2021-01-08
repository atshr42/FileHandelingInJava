/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg4.pkg2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aashish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
           FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("source.txt");
            out = new FileWriter("destination.txt");
            int temp;
            while (true) {
                temp = in.read();
                if (temp == -1) {
                    break;
                } else {
                    out.write(temp);
                    out.write(temp);
                    
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("The required file is not found");
        } catch (IOException e) {
            System.out.println("The file writing operation could not be complete");
        } catch (Exception e) {
            System.out.println("Error Occoured");
        } finally {
            System.out.println("Operation completed with no errors");
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
    
}
