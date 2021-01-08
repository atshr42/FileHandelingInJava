package pkg1.pkg4.pkg1;

/**
 *
 * @Aashish Shrestha.
 */
import java.io.*;
import java.nio.file.FileSystemNotFoundException;

public class CharacterStreamCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileSystemNotFoundException, IOException {
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
