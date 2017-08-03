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
    private List<String>card = new ArrayList<String>();
    private List<Integer>cardValue = new ArrayList<Integer>();

        public List<String> makeCard() {

            for (String suit: suits){
                for (String value : values) {
                    card.add(suit + value);
                    for (Integer point : points) {

                    }
                }

            }

            return card;
        }
}
