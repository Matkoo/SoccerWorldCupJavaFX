package soccerwc.model;

import java.util.Set;

/**
 *
 * @author Matko
 */
public class Wife extends People{
     
    private Integer freeTime;

    public Wife() {
    }
    
    public Wife(String name,Integer freeTime) {
        this.name=name;
        this.freeTime = freeTime;
    }
    

    public Wife(Integer freeTime, String name, Set<FootballMatch> wachedMatch) {
        super(name, wachedMatch);
        this.freeTime = freeTime;
    }

    public Integer getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Integer freeTime) {
        this.freeTime = freeTime;
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
        freeTime+=FootballMatch.getPLAY_TIME();
        if (footballMatch.isOverTimeMatch()){
            freeTime+=FootballMatch.getOVER_TIME();
        }        
    }
    @Override
    public String toString() {
        return "Wife: "+name;
    }
    
}
