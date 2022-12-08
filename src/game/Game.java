package game;

import objects.*;

public class Game {
    private int nbPlayers;
    private Enterprise enterprises[];
    private int materialsCost[];


    public Game(int nbPlayers, Enterprise[] enterprises, int[] materialsCost) {
        this.nbPlayers = nbPlayers;
        this.enterprises = enterprises;
        this.materialsCost = materialsCost;
    }

    public static void main(String[] args) {
        
    }
}
