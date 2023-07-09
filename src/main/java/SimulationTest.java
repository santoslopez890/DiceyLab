import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void runSimulation() {
        Simulation.getSimulationperams(2,1000000);

        Simulation.runSimulation();
        Simulation.printResults();
    }


}