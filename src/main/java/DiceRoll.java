import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    private static int tosses;


    public DiceRoll(int numberOfTosses) {
        DiceRoll.tosses=numberOfTosses;

    }
//Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//
//Create a simulation where two dies are thrown one million times. Keep track of all results.


    public static void runSimulation() {
        Random rd = new Random();

        int diceRoll;
        int sumOfRoll = 0;
        int max=6;
        int min=1;

            for (int i = 0; i < tosses; i++) {
                diceRoll= rd.nextInt(max - min + 1) + min;
                sumOfRoll += diceRoll;
            }
            System.out.println("sum roll is "+sumOfRoll);



    }
    // public static void printResults(){
    //  return null;
    //}



}