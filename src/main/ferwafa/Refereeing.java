package main.ferwafa;

import lombok.Builder; import lombok.Data;
import main.R;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Data
public class Refereeing {
    @Builder.Default private String referee = "Mukansanga Salima";
    private Match match;

    Refereeing(Match match){
        this.match = match;
    }
    public void redCard(Player player){ player.redCard(); }
    public void yellowCard(Player player){ player.yellowCard(match); }
    public void startMatch(){ match.start(); }
    public void endMatch(){match.end();}

    public void randomRefereeing(){
        int redCardInMatch =2 + R.r.nextInt(5);
        int yellowCardInMatch = R.r.nextInt(10);
        HashSet<String> playersGetRedCard = new HashSet<>();
        while (redCardInMatch-- != 0){
            boolean isInHomeTeam = R.r.nextBoolean();
            int randomPlayerIndex = R.r.nextInt(match.getHomeTeam().getPlayers().size());
            Player chosenPlayer;
            if(isInHomeTeam){ chosenPlayer = match.getHomeTeam().getPlayers().get(randomPlayerIndex);}
            else { chosenPlayer = match.getAwayTeam().getPlayers().get(randomPlayerIndex);}
            if(!playersGetRedCard.contains(chosenPlayer.getPlayerId())) {
                chosenPlayer.redCard();
                playersGetRedCard.add(chosenPlayer.getPlayerId());
            }

        }
        while (yellowCardInMatch--!=0){
            Boolean inHomeTeam = R.r.nextBoolean();
            int randomPlayerIndex = R.r.nextInt(match.getHomeTeam().getPlayers().size());
            Player chosenPlayer;
            if(inHomeTeam){ chosenPlayer = match.getHomeTeam().getPlayers().get(randomPlayerIndex);}
            else { chosenPlayer = match.getAwayTeam().getPlayers().get(randomPlayerIndex);}
            if(!playersGetRedCard.contains(chosenPlayer.getPlayerId())) {
                chosenPlayer.yellowCard(match);
            }
        }
    }
}
