package main.ferwafa;


import main.R;

import java.util.ArrayList;
import java.util.Scanner;

public class FerwafaNotificationSystem {
    public ArrayList<Match> matches = new ArrayList<>();

    public void playersCards(){
        matches.forEach(match -> {
            System.out.println("MATCH ID " + match.getMatchId() +"\n -------------------------------------------");
            System.out.println("\t HOME TEAM ID " + match.getHomeTeam().getTeamId() +"\n \t --------------------------------");
            match.getHomeTeam().getPlayers().forEach(player -> {
                System.out.println("\t \t PLAYER ID " + player.getPlayerId() +"\n \t \t ----------------------------------");
                    System.out.println("\t \t yellow cards :" + player.getTotalYellowCards() +"\n \t \t red cards :" + player.getTotalRedCards());

            });
            System.out.println("\t AWAY TEAM ID " + match.getHomeTeam().getTeamId() +"\n \t --------------------------------");
            match.getAwayTeam().getPlayers().forEach(player -> {
                System.out.println("\t \t PLAYER ID " + player.getPlayerId() +"\n \t \t ----------------------------------");
                System.out.println("\t \t yellow cards :" + player.getTotalYellowCards() +"\n \t \t red cards :" + player.getTotalRedCards());
            });
            System.out.println("\n \n \n");
        });
    }
    public void playerWithYellowCard(){}

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        FerwafaNotificationSystem ntf = new FerwafaNotificationSystem();
        int nOfRandomMatch =3+ R.r.nextInt(22);
        int n = nOfRandomMatch;
        Match match;
        while (n-- != 0){
            Team homeTeam = new Team();
            Team awayTeam = new Team();
            match = new Match(homeTeam,awayTeam);
            ntf.matches.add(match);
            Refereeing refereeing = new Refereeing(match);
            refereeing.randomRefereeing();
        }
        while (true){
            System.out.println("" +
                    "1. VIEW PLAYER CARDS \n" +
                    "0. EXIT");
            System.out.print("ENTER CHOICE:");
            switch (input.nextInt()){
                case 1:{System.out.println("in " + ntf.matches.size() + " matches \n \n");
                    ntf.playersCards(); break; }
                case 0: {return;}
                default: {System.out.println("WRONG CHOICE"); break;}
            }
        }


    }
}
