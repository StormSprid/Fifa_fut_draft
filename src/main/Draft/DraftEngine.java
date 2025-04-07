package main.Draft;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import main.Entities.Player;

import java.util.List;
import java.util.Scanner;
@NoArgsConstructor


public class DraftEngine {
    public static void startDraft(){
        System.out.println("Start Draft:");
    }

    public Player pickPlayer(List<Player> playerList,Scanner scanner){
        Player player = new Player();
        System.out.println("Pick Player: ");
        for(int i = 0;i < 4;i++){
            player = playerList.get(i);
            System.out.printf("%d)%s | %s | %s \n",i+1,player.getName(),player.getPosition(),player.getNationality());

        }
        int result = scanner.nextInt();
        if(result>4){
            System.out.println("Incorrect input");
        }


        return playerList.get(result - 1);

    }
}
