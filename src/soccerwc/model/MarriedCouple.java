package soccerwc.model;

/**
 *
 * @author Matko
 */
public class MarriedCouple {
    
    private Husband husband;
    private Wife wife;

    public MarriedCouple() {
    }

    public MarriedCouple(Husband husband, Wife wife) {
        this.husband = husband;
        this.wife = wife;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "MarriedCouple{" + "husband=" + husband + ", wife=" + wife + '}';
    }
    
    
    
}
