package soccerwc.model;

import java.util.Set;

/**
 *
 * @author Matko
 */
public class Husband extends People {

    private Integer beersNumber = 0;
    private final Integer godMatch = 1;
    private final Integer badMatch = 2;

    public Husband() {
    }

    public Husband(String name,Integer beersNumber) {
        this.name=name;
        this.beersNumber=beersNumber;
    }

    public Husband(Integer beersNumber, String name, Set<FootballMatch> wachedMatch) {
        super(name, wachedMatch);
        this.beersNumber = beersNumber;
    }

    public Integer getBeersNumber() {
        return beersNumber;
    }

    public void setBeersNumber(Integer beersNumber) {
        this.beersNumber = beersNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FootballMatch> getWachedMatch() {
        return wachedMatch;
    }

    public void setWachedMatch(Set<FootballMatch> wachedMatch) {
        this.wachedMatch = wachedMatch;
    }
    
    

    @Override
    public void watchingMatch(FootballMatch footballMatch) {
        if (footballMatch.isGoodMatch()) {
            beersNumber += godMatch;
        } else {
            beersNumber += badMatch;
        }
    }

    @Override
    public String toString() {
        return "Husband: "+name;
    }
   

}
