package game;

import objects.*;

import java.util.Random;
import java.util.Scanner;



/* Cette classe est le point de départ de chaque partie. Ella 
 * Va transmettre a la classe Game toutes les informations récupérées
 * des joueurs dans sa méthode main.
 */


public class Start {
    public static void main(String[] args) {
        Enterprise enterprises[];
        int nbPlayers;
        int materialsCost[] = new int[20];       
        
        Random rand = new Random();

        for (int turn = 0; turn < 20; turn ++) {
            materialsCost[turn] = rand.nextInt(200) - 50;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de joueurs.\n");       // on demande le nombre de joueurs
        String strNbPlayers = sc.nextLine();
        nbPlayers = Integer.parseInt(strNbPlayers);

        enterprises = new Enterprise[nbPlayers];        // initialisation d'un liste de nbPlayers entreprises

        String enterpriseName;

        for (int i = 0; i < nbPlayers; i++) {           // on demande aux joueurs le nom de chaque entreprise
            System.out.println("Entrez le nom de l'entreprise du joueur " + i + ".");
            enterpriseName = sc.nextLine();
            enterprises[i] = new Enterprise(enterpriseName, i);
        }

        sc.close();

        Game partie = new Game(nbPlayers, enterprises, materialsCost);

    }
}
