package main.MatchSimulator;

import main.Draft.DraftEngine;
import main.Entities.Team;

public class MatchSimulator {
    public static void main(String[] args) {
        DraftEngine de = new DraftEngine();
        Team team = de.startDraft();
        if (team.getChemistry() < 10 || team.getRating() <97){
            System.out.println("Твоя команда говно");
        }else{
            System.out.println("Твоя команда норм");
        }
    }

}
