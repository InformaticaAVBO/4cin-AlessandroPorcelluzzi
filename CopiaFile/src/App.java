import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void copyFile(String fileIn, String fileOut) throws IOException{
        File f = new File(fileIn);
        Scanner leggiFile = new Scanner(f);
        FileWriter scriviFile = new FileWriter(fileOut);
        //leggi 
        while (leggiFile.hasNextLine()){
            String s = leggiFile.nextLine();
            scriviFile.write(s);
        }
        leggiFile.close();
        scriviFile.close();


    }





    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi il nome del file sorgente: ");
        String nomeSorgente = scanner.nextLine();
        System.out.println("Dammi il nome del file i destinazione: ");
        String nomeDestinazione = scanner.nextLine();
        scanner.close();
        // Apre il file sorgente e lo legge per copiarlo in quello destinazione

        copyFile(nomeSorgente, nomeDestinazione);




    }
}
