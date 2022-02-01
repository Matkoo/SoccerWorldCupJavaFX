package comparators;

import soccerwc.model.MarriedCouple;
import java.util.Comparator;


/**
 *
 * Class for make sorting 
 */
public class BeerComparator implements Comparator<MarriedCouple>{

    @Override
    public int compare(MarriedCouple o1, MarriedCouple o2) {
        return o2.getHusband().getBeersNumber()-o1.getHusband().getBeersNumber();
    }

   
    
}
