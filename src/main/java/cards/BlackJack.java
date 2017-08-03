package cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {
    public String[] getSuits() {
        return suits;
    }

    private String[] suits = {"Hearts"};
    private String[] values = {"King"};
    private Integer[] points = {10};
    private List<String>cards = new ArrayList<String>();
    private List<Integer>cardValue = new ArrayList<Integer>();
    private int test =0;
        public List<String> makeCard() {

            for (String suit: suits){
                for (String value : values) {
                    cards.add(suit + value);
                    for (Integer point : points) {
                        cardValue.add(point);
                        System.out.println(cardValue);
                    }
                }

            }

            return cards;
        }

        public List<Integer> CardPoint(String card){
            makeCard();
            return cardValue;
        }
        public int DealCardPoint (String card) {
            makeCard();
            for(String card1 : cards) {
                if (card1.equals(card)) {
                  test =  cards.indexof(card1);
                }
            }
            return points;
        }
}
