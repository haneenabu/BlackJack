package cards;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJackTest {
    @Test
    public void newBlackJack_InstantiateCorrectly() throws Exception {
        BlackJack testAdventure = new BlackJack();
        assertEquals(true, testAdventure instanceof BlackJack);

    }
    @Test
    public void makeCard_dealOneCard_HeartKing() {
        BlackJack testAdventure = new BlackJack();
        ArrayList<String>expectedOutput = new ArrayList<String>();
        expectedOutput.add("HeartsKing");
        assertEquals(expectedOutput, testAdventure.makeCard());
    }

    @Test
    public void CardPoint_correlate
}