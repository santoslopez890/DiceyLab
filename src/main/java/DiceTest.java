import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    @Test
    void runSimulationDiceRoll() {
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(3);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(4);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(5);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(6);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(7);
        DiceRoll.runSimulation();
    }
}
