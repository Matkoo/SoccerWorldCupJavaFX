package soccerwc.model;

/**
 *
 * @author Matko
 */
public class FootballTeam {
    private String name;

    public FootballTeam() {
    }

    public FootballTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FootballTeam{" + "name=" + name + '}';
    }
    
    
}
