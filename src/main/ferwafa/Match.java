package main.ferwafa;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data //this generate setter and getter for us
public class Match{
    private LocalDateTime dateOfMatch;
    private Team homeTeam;
    private Team awayTeam;
    @Builder.Default
    private String ChampionName = "Rwanda premier league";
    @Builder.Default
    private String stadiumName = "Mahoro stadium";
    @Builder.Default
    private String status = "pending";

    Match(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam; this.awayTeam = awayTeam;
    }
    public void start(){
        this.status = "happening";
        dateOfMatch = LocalDateTime.now();
    }
    public void end(){
        this.status = "end";
    }
}
