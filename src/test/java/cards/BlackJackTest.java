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
    public void CardPoint_correlateCardToPoints_10(){
        BlackJack testAdventure = new BlackJack();
        ArrayList<Integer>expectedPoint = new ArrayList<Integer>();
        expectedPoint.add(10);
        assertEquals(expectedPoint, testAdventure.CardPoint("HeartsKing"));
    }

    @Test
    public void DealCardPoint_dealCardToUser_HeartsKing(){
        BlackJack testAdventure = new BlackJack();
        int expectedCardPoint = 10;
        assertEquals(expectedCardPoint, testAdventure.DealCardPoint("HeartsKing"));
    }
}