import java.util.Random;

public class DiceMain {



    //Used for testing
    public static void main(String[] args) {
        Simulation.getSimulationperams(2,1000);
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        //Bins results = new Bins(2, 12);
        //DiceRoll.runSimulation();
        Simulation.runSimulation();

        Simulation.printResults();


    }



}
