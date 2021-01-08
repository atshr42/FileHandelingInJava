/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg4.pkg4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = null;
        String holder;
        Scanner input = new Scanner(System.in);
        try{
            in = new BufferedReader(new FileReader("source.txt"));
            String line;
            while(true){
                line = in.readLine();
                if(line == null) break;               
                System.out.println(line);
                holder = input.nextLine();
            }
            
        }
        finally{
            if(in != null) in.close();
            System.out.println("The operation completed with no errors");
        }
    }
    
}
