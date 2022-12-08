package game;

import java.util.Random;

import objects.Customer;

public class Test {
    public static void main(String[] args) {
        Customer customers[] = new Customer[100];

        int age;
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            age = rand.nextInt(105) - 20;
            customers[i] = new Customer(age);
        }

        for (int j = 0; j < 100; j++) {
            System.out.println("Type du customer numéro " + (j+1) + " : " + customers[j].getType());
        }
    }
}
