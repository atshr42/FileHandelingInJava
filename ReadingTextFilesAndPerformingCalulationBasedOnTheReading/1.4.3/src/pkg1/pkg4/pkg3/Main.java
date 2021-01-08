/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg4.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out;
        try (Scanner in = new Scanner(new File("source.txt"))) {
            out = new PrintWriter(new File("destination.txt"));
            int recordCount = in.nextInt();
            System.out.println("No of recoeds found :- " + recordCount);
            for (int i = 0; i < recordCount; i++) {
                String name = in.next();
                int principal = in.nextInt();
                float rate = in.nextFloat();
                float time = in.nextFloat();
                double simpleIntrest = ((principal * rate * time)) / 100;
                out.printf("%s %d %f %f %f %n", name, principal, rate, time, simpleIntrest);
            }
        }
        out.close();
        System.out.println("The operation completed");
    }

}
