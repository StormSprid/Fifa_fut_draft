package main;

import main.Entities.Team;
import main.Logic.Players.Teams.TeamBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        var manager = new LoadPlayers();
//        var club = manager.getPlayersByClub("barcelona");
//        var nat = manager.getPlayersByNationality("france");
//        manager.getFirstPlayerByPosition(Position.CB)
//                .ifPresent(System.out::println);
        Team tm = TeamBuilder.generateTestTeam();
        tm.displayTeam();




    }

}