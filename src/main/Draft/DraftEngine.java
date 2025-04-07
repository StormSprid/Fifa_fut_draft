package main.Draft;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import main.Entities.Player;
import main.Entities.Position;
import main.Entities.Team;
import main.Logic.Players.LoadPlayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@NoArgsConstructor


public class DraftEngine {
    Scanner scanner = new Scanner(System.in);
    Team team = new Team("My Team",null,0,0);
    public static void main(String[] args) {
        DraftEngine de = new DraftEngine();
        de.startDraft();
    }
    public  Team startDraft(){
        int cbCount=0;
        System.out.println("Start Draft:\n");
        LoadPlayers ld = new LoadPlayers();
        List<Player> choosenTeam = new ArrayList<>();
        for(int i = 0; i < 11; i++) {
            if (i == 3) { // CB
                for (cbCount = 0; cbCount < 1; cbCount++) {
                    System.out.printf("Round %d:\n", i + cbCount + 1);
                    Player choosenPlayer = pickPlayer(ld.getPlayersByPosition(Position.CB), scanner);
                    choosenTeam.add(choosenPlayer);
                    System.out.println(choosenPlayer.getName() + " Added");
                }
                continue;
            }

            System.out.printf("Round %d:\n", i + 1);
            Player choosenPlayer = pickPlayer(ld.getPlayersByPosition(Position.getPositionByValue(i + 1)), scanner);
            choosenTeam.add(choosenPlayer);
            System.out.println(choosenPlayer.getName() + " Added");

        }
        team.setPlayers(choosenTeam);
        team.displayTeam();
        return  team;
    }


    public Player pickPlayer(List<Player> playerList,Scanner scanner){
        Player player = new Player();
        int count = Math.min(4, playerList.size());
        System.out.println("Pick Player: ");
        for(int i = 0;i < count;i++){
            player = playerList.get(i);
            System.out.printf("%d)%s | %s | %s \n",i+1,player.getName(),player.getPosition(),player.getNationality());

        }

        int result = scanner.nextInt();
        if(result>count){
            System.out.println("Incorrect input");
        }


        return playerList.get(result - 1);

    }
}
