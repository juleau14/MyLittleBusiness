package game;

import java.util.Random;

import objects.*;

public class Game {
    private int nbPlayers;
    private Enterprise enterprises[];
    private int materialsCost[];
    private Customer customers[] = new Customer[10000];


    public Game(int nbPlayers, Enterprise[] enterprises, int[] materialsCost) {
        this.nbPlayers = nbPlayers;
        this.enterprises = enterprises;
        this.materialsCost = materialsCost;
        
        int age;
        for (int i = 0; i < 10000; i++) {
            Random rand = new Random();
            age = rand.nextInt(105) - 20;
            customers[i] = new Customer(age);
        }
    }

    public static void main(String[] args) {
        
    }
}
