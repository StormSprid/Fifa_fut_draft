package main.Logic.Players;

import main.Entities.Player;
import main.Entities.Position;

import java.util.List;
import java.util.Optional;

public interface PlayerProvider {
    List<Player> getAllPlayers();
    List<Player> getPlayersByNationality(String nationality);
    List<Player> getPlayersByClub(String club);
    List<Player> getSortedPlayersByRating();
    List<Player> getSortedPlayersByRatingBackward();
    Optional<Player> getFirstPlayerByPosition(Position position);
    Optional<Player> getPlayerByPositionWithSkip(Position position,int skip);
    List<Player> getPlayersByPosition(Position position);

}
