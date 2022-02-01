package main.ferwafa;

import lombok.Builder; import lombok.Data; import main.Citizen;

@Data //this generate setter and getter for us
@Builder
public class Player extends Citizen {
    private String teamName;
    private String disciplineStatus;
    @Builder.Default private int totalYellowCards = 0;
    @Builder.Default private int totalRedCards = 0;
    @Builder.Default private int yellowCardsInOneMatch = 0;
//    @Builder.Default
//    private int consecutiveYellowCards = 0;

    private int playingPosition;
    @Builder.Default private Boolean allowedToPlayNextMatch = true;

    private Match nearMatchPlayed;

    public void yellowCard(Match match){
        if(match.canEqual(nearMatchPlayed)){ if (yellowCardsInOneMatch == 1) { redCard();
            } else {
                this.yellowCardsInOneMatch = 1;
            }
        } else{ this.nearMatchPlayed = match; yellowCardsInOneMatch = 1;
        }
        totalYellowCards++;
    }
    public void redCard(){ this.totalRedCards+=1; suspend(); }
    public void suspend(){ this.allowedToPlayNextMatch = false; }

}
