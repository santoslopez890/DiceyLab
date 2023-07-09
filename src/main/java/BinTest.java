import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BinTest {
    @Test
    void bins() {
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        DiceRoll.GetDiceRoll(2);
        DiceRoll.runSimulation();
        Bins.getBinSize(2,7);
        Bins.bin(5);

    }
}
