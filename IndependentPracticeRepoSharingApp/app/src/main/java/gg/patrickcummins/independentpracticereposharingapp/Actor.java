package gg.patrickcummins.independentpracticereposharingapp;

/**
 * Created by patrickcummins on 7/25/16.
 */
public class Actor {
    String name, dob;
    int oscarsWon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getOscarsWon() {
        return oscarsWon;
    }

    public void setOscarsWon(int oscarsWon) {
        this.oscarsWon = oscarsWon;
    }

    public Actor(String name, String dob, int oscarsWon) {
        this.name = name;
        this.dob = dob;
        this.oscarsWon = oscarsWon;

    }
}
