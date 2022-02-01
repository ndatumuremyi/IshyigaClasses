package main.ferwafa;

import lombok.Builder; import lombok.Data;

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
}
