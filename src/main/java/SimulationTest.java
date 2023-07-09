import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @org.junit.jupiter.api.Test
    void runSimulation() {
        Simulation sim = new Simulation(3, 10);

        sim.runSimulation();
    }
    @Test
    void runSimulationDiceRoll() {
        DiceRoll.runSimulation();
    }
}