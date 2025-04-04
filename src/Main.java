import Entities.Player;
import Entities.Position;
import Entities.Team;
import Logic.Players.LoadPlayers;
import lombok.var;

public class Main {
    public static void main(String[] args) {
//        var manager = new LoadPlayers();
//        var club = manager.getPlayersByClub("barcelona");
//        var nat = manager.getPlayersByNationality("france");
//        manager.getFirstPlayerByPosition(Position.CB)
//                .ifPresent(System.out::println);
        Team tm = new Team();
        tm.displayTeam();

    }
}