package seriea;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        Campionato c = new Campionato("data/SerieA.csv");
        
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        int scelta;

        
            System.out.println("=== MENU ===");
            System.out.println("1. Mostra classifica");
            System.out.println("2. Mostra squadra");
            System.out.println("0. Esci");

            scelta = scanner.nextInt();

            if (scelta == 1) {
                c.stampaClassifica();
   
                
                
            } else if (scelta == 2) {

                System.out.println("\nCalcolo dei punteggi per ogni squadra:");
                for (int i = 0; i < 20; i++) {
                    Squadra s = c.getSquadra(i);
                    int puntiCalcolati = s.getVinte() * 3 + s.getPareggiate();
                    System.out.println(s.getNome() + ":" + puntiCalcolati + " punti");
                }
                
                
            } else if (scelta == 3) {
                
                c.ordinaClassifica();
                System.out.println("Classifica ordinata per punti:");
                c.stampaClassifica();
                
                
                
                
                
                
            } else if (scelta== 4){

                Scanner input = new Scanner(System.in);
                System.out.print("\n" + "Inserisci il nome della squadra: ");
                String nomeSquadra = input.nextLine();
                c.stampaSquadra(nomeSquadra);
                
                
            } else if (scelta== 5){
                System.out.println("esci");
            }

            System.out.println();

        

        scanner.close();

        
        
    }
    
}