package main;

import lombok.Data;

@Data
public class Player extends Citizen{
    private String teamName;
    private String disciplineStatus;
    private int totalYellowCards;
    private int totalRedCards;
    private int yellowCardsInOneMatch;
    private int consecutiveYellowCards;
    private int playingPosition;
    private String Status;

}
