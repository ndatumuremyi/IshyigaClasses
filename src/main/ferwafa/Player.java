package main.ferwafa;

import lombok.AllArgsConstructor;
import lombok.Builder; import lombok.Data;
import lombok.NoArgsConstructor;
import main.Citizen;
import main.R;

@Data //this generate setter and getter for us
@Builder
@AllArgsConstructor
public class Player extends Citizen {
    private String disciplineStatus;
    private String playerId;
    @Builder.Default private int totalYellowCards = 0;
    @Builder.Default private int totalRedCards = 0;
    @Builder.Default private int yellowCardsInOneMatch = 0;
//    @Builder.Default
//    private int consecutiveYellowCards = 0;
    public Player(){
        playerId = R.getRandomId();
    }

    private int playingPosition;
    @Builder.Default private Boolean allowedToPlayNextMatch = true;

    private Match nearMatchPlayed;

    public void yellowCard(Match match){
        if(match.canEqual(nearMatchPlayed)){ if (yellowCardsInOneMatch == 1 ) { redCard();
            } else if(yellowCardsInOneMatch < 1) {
                this.yellowCardsInOneMatch = 1; totalYellowCards++;
            }
        } else{ this.nearMatchPlayed = match; yellowCardsInOneMatch = 1; totalYellowCards++;
        }

    }
    public void redCard(){ this.totalRedCards+=1; suspend(); }
    public void suspend(){ this.allowedToPlayNextMatch = false; }

}
