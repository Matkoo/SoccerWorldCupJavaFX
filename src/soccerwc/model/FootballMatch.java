package soccerwc.model;

/**
 *
 * @author Matko
 */
public class FootballMatch {
    
    private FootballTeam teamOne;
    private FootballTeam teamTwo;
    private static final Integer PLAY_TIME=120;
    private static final Integer OVER_TIME=10;
    private boolean goodMatch;
    private boolean overTimeMatch;

    public FootballMatch() {
    }

    public FootballMatch(FootballTeam teamOne, FootballTeam teamTwo, boolean goodMatch, boolean overTimeMatch) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.goodMatch = goodMatch;
        this.overTimeMatch = overTimeMatch;
    }

    

    public FootballTeam getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(FootballTeam teamOne) {
        this.teamOne = teamOne;
    }

    public FootballTeam getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(FootballTeam teamTwo) {
        this.teamTwo = teamTwo;
    }

    public boolean isGoodMatch() {
        return goodMatch;
    }

    public void setGoodMatch(boolean goodMatch) {
        this.goodMatch = goodMatch;
    }

    public boolean isOverTimeMatch() {
        return overTimeMatch;
    }

    public void setOverTimeMatch(boolean overTimeMatch) {
        this.overTimeMatch = overTimeMatch;
    }
    

    public static Integer getPLAY_TIME() {
        return PLAY_TIME;
    }

    public static Integer getOVER_TIME() {
        return OVER_TIME;
    }
    

    @Override
    public String toString() {
        return "FootballMatch{" + "teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", goodMatch=" + goodMatch + '}';
    }

    
    
    
}
