package soccerwc.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Matko
 */
public abstract class People {
    protected String name;
    protected  Set<FootballMatch> wachedMatch = new HashSet<>();

    public People() {
    }

    public People(String name,Set<FootballMatch> wachedMatch) {
        this.name = name;
        this.wachedMatch=wachedMatch;
    }

    

    public Set<FootballMatch> getWachedMatch() {
        return wachedMatch;
    }

    public void setWachedMatch(Set<FootballMatch> wachedMatch) {
        this.wachedMatch = wachedMatch;
    }

    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public abstract void watchingMatch(FootballMatch footballMatch);
    
    
    
}
