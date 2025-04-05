package Entities;

import Logic.Players.LoadPlayers;
import Logic.Teams.LoadTeams;
import lombok.*;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Team {
    protected String name;
    protected List<Player> players;
    protected int chemistry;
    protected  int rating;



    private void addIfPresentOrStub(Optional<Player> optional, Position position) {
        Player player = optional.orElse(new Player("—", position, 0, "-", "-"));
        players.add(player);
    }

    public void displayTeam(){
        Player gk  = findFirst(Position.GK);
        Player rb  = findFirst(Position.RB);
        Player cb1 = findFirst(Position.CB);
        Player cb2 = findSecond(Position.CB);
        Player lb  = findFirst(Position.LB);
        Player cdm = findFirst(Position.CDM);
        Player cm  = findFirst(Position.CM);
        Player cam = findFirst(Position.CAM);
        Player lw  = findFirst(Position.LW);
        Player st  = findFirst(Position.ST);
        Player rw  = findFirst(Position.RW);

        System.out.println("\n" + rw.getName() + "    " + st.getName() + "      " + lw.getName());

        System.out.println("\n" + cam.getName() + "               " + cm.getName());

        System.out.println("\n              " + cdm.getName() + "         ");

        System.out.println("\n" + rb.getName() + " " + cb1.getName() + " " + cb2.getName() +" " + lb.getName());

        System.out.println("\n              " + gk.getName() + "         ");

        System.out.printf("Total rating: %d\n",this.getRating());
        System.out.printf("Total Chemistry: %d\n",this.getChemistry());

    }
    public int getRating(){
        int total=0;
        for (int i =0;i<players.size();i++){
            total+=players.get(i).getRating();
        }
        return total/10;
    }
    public int getChemistry() {
        int sameNationality = 0;
        int sameClub = 0;
        for (int i = 0; i < players.size(); i++) {
            for (int j = i + 1; j < players.size(); j++) {
                Player p1 = players.get(i);
                Player p2 = players.get(j);

                if (p1.getNationality().equals(p2.getNationality())) {
                    sameNationality += 1;
                }
                if (p1.getClub().equals(p2.getClub())) {
                    sameClub += 3;
                }

            }
        }
        return sameClub + sameNationality;
    }
    private Player findFirst(Position position) {
        return players.stream()
                .filter(p -> p.getPosition() == position)
                .findFirst()
                .orElse(new Player("—", position, 0, "-", "-"));
    }

    private Player findSecond(Position position) {
        return players.stream()
                .filter(p -> p.getPosition() == position)
                .skip(1)
                .findFirst()
                .orElse(new Player("—", position, 0, "-", "-"));
    }


}
