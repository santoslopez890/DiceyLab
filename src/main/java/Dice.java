import java.util.Random;

public class Dice {



    //You can use a main() to run the simulations.
    //
    //In your pull requests, create a new file with your name as the filename. Paul's would be PaulResults.md
    //
    //Paste a copy of your text results into that file and then submit your pull request.
    //
    //the results of the sim.printResults() should be an output string that looks like this:
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 100);
        DiceRoll dice = new DiceRoll(2); // for craps
        //DiceRoll dice2 = new DiceRoll(5); // for yatzee
        //Bins results = new Bins(2, 12);
        dice.runSimulation();
        sim.runSimulation();
        sim.printResults();

        //sim.printResults();
    }



}
