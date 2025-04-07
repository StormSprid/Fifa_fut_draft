package main.Logic.Players.Teams;

import main.Entities.Player;
import main.Entities.Position;
import main.Entities.Team;
import main.Logic.Players.LoadPlayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeamBuilder {
    private static final LoadPlayers lp = new LoadPlayers();
    public static Team generateTestTeam() {
        List<Player> players = new ArrayList<>();

        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.GK), Position.GK);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.RB), Position.RB);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.CB), Position.CB);
        addIfPresentOrStub(players,lp.getPlayerByPositionWithSkip(Position.CB, 1), Position.CB);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.LB), Position.LB);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.CDM), Position.CDM);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.CM), Position.CM);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.CAM), Position.CAM);
        addIfPresentOrStub(players,lp.getPlayerByPositionWithSkip(Position.LW,2), Position.LW);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.ST), Position.ST);
        addIfPresentOrStub(players,lp.getFirstPlayerByPosition(Position.RW), Position.RW);

        Team teamEmil = new Team("Emil",players, 0,0);
        teamEmil.setChemistry(teamEmil.getChemistry());
        teamEmil.setRating(teamEmil.getRating());

        return teamEmil;
    }
    private static void addIfPresentOrStub(List<Player> players, Optional<Player> opt, Position pos) {
        players.add(opt.orElse(new Player("—", pos, 0, "-", "-")));
    }
}
