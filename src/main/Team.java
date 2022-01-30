package main;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Team {
    private ArrayList<Player> players;
    private String headCoachName;
    private Player teamCaptain;
    private byte division;
    private String name;
    private boolean isWomenTeam;
}
