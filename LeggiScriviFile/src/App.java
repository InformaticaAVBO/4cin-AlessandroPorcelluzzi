import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i=0; i<100; i++){
            myWriter.write("Questa è una prima fase scritta in un file\n");
        }

        myWriter.close();
        System.out.println("Ok, ho scritto sul file!");
        */

        
        File f = new File("filename.txt");
        Scanner leggi = new Scanner(f);
        while(leggi.hasNextLine()){
            String s = leggi.nextLine();
            System.out.println(s);

        }
        leggi.close();

    }

        
}