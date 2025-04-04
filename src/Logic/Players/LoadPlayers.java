package Logic.Players;

import Entities.Player;
import Entities.Position;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LoadPlayers implements PlayerProvider{
    private final String fileName = "players.csv";
     List<Player> players = new ArrayList<>();


    @Override
    public  List<Player> getAllPlayers() {
            players.clear();
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                String line;
                String[] playerInfo;
                while((line = br.readLine())!=null){
                    playerInfo = line.split(",");
                    Player player = new Player();
                    player.setName(playerInfo[0]);
                    player.setPosition(Position.valueOf(playerInfo[1]));
                    player.setRating(Integer.parseInt(playerInfo[2]));
                    player.setClub((playerInfo[3]));
                    player.setNationality((playerInfo[4]));

                    players.add(player);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return players;
    }

    @Override
    public List<Player> getPlayersByNationality(String nationality) {
        return getAllPlayers().stream()
                .filter(player -> player.getNationality().equalsIgnoreCase(nationality)
                        )
                .collect(Collectors.toList());

    }

    @Override
    public List<Player> getPlayersByClub(String club) {
        return getAllPlayers().stream()
                .filter(player -> player.getClub().equalsIgnoreCase(club))
                .collect(Collectors.toList());
    }

    @Override
    public List<Player> getSortedPlayersByRatingBackward() {
        return getAllPlayers()
                .stream()
                .sorted(Comparator.comparingInt(Player::getRating))
                .collect(Collectors.toList());
    }

    @Override
    public List<Player> getSortedPlayersByRating() {
        return getAllPlayers()
                .stream()

                .sorted(Comparator.comparingInt(Player::getRating).reversed())

                .collect(Collectors.toList());
    }
    @Override
    public Optional<Player> getFirstPlayerByPosition(Position position){
            return getAllPlayers().stream().filter(player -> player.getPosition().equals(position))
                    .findFirst();
    }

}