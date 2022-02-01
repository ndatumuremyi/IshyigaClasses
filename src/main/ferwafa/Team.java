package main.ferwafa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data; import lombok.Singular;
import main.R;

import java.util.ArrayList;
import java.util.Queue;

@Data //this generate setter and getter for us
@Builder
@AllArgsConstructor
public class Team {
    private ArrayList<Player> players = new ArrayList<>();
    private String headCoachName;
    private Player teamCaptain;
    private byte division;
    private String name;
    private String teamId;
    @Builder.Default private boolean isWomenTeam = false;

    public Team(){
        teamId = R.getRandomId();
        generateRandomPlayers();
    }
    public void generateRandomPlayers(){
        int n = 12;
        Player player;
        while (n-- != 1){
            player = new Player();
            player.setPlayerId(R.getRandomId());
            player.setPlayingPosition(n);

            this.players.add(player);
        }
    }
}
