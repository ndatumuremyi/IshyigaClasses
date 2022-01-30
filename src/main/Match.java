package main;

import lombok.Data;

import java.util.Date;

@Data
public class Match {
    private Date dateOfMatch;
    private Team homeTeam;
    private Team AwayTeam;
    private String refaName;
    private String ChampionName;
    private String stadiumName;
    private String status;
}
