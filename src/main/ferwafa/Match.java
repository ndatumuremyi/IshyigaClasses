package main.ferwafa;

import lombok.Builder; import lombok.Data;
import main.R;

import java.time.LocalDateTime;
import java.util.Calendar;

@Data //this generate setter and getter for us
public class Match{
    private Calendar dateOfMatch;
    private Team homeTeam;
    private Team awayTeam;
    private String matchId;
    @Builder.Default private String ChampionName = "Rwanda premier league";
    @Builder.Default private String stadiumName = "Mahoro stadium";
    @Builder.Default private String status = "pending";

    Match(Team homeTeam, Team awayTeam){
        matchId = R.getRandomId();
        this.homeTeam = homeTeam; this.awayTeam = awayTeam;
    }
    public void start(){
        this.status = "happening";
        dateOfMatch = Calendar.getInstance();
    }
    public void end(){
        this.status = "end";
    }
}
