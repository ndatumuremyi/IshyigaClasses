package main.ferwafa;

import lombok.Data; import lombok.Singular; import java.util.ArrayList;

@Data //this generate setter and getter for us
public class Team {
    @Singular private ArrayList<Player> players;
    private String headCoachName;
    private Player teamCaptain;
    private byte division;
    private String name;
    private boolean isWomenTeam;
}
