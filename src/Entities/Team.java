package Entities;

import Logic.Players.LoadPlayers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Team {
    protected String name;
    protected List<Player> players;
    private LoadPlayers lp = new LoadPlayers();
    protected int chemistry;
    protected  int rating;


    public void displayTeam(){
        Optional<Player> gk = lp.getFirstPlayerByPosition(Position.GK);
        Optional<Player> rb = lp.getFirstPlayerByPosition(Position.RB);
        Optional<Player> cb = lp.getFirstPlayerByPosition(Position.CB);
        Optional<Player> lb = lp.getFirstPlayerByPosition(Position.LB);
        Optional<Player> cdm = lp.getFirstPlayerByPosition(Position.CDM);
        Optional<Player> cm = lp.getFirstPlayerByPosition(Position.CM);
        Optional<Player> cam = lp.getFirstPlayerByPosition(Position.CAM);
        Optional<Player> lw = lp.getFirstPlayerByPosition(Position.LW);
        Optional<Player> st = lp.getFirstPlayerByPosition(Position.ST);
        Optional<Player> rw = lp.getFirstPlayerByPosition(Position.RW);


        System.out.println("\n" + rw.get().getName() + "    " + st.get().getName() + "      " + lw.get().getName());

        System.out.println("\n" + cam.get().getName() + "               " + cm.get().getName());

        System.out.println("\n              " + cdm.get().getName() + "         ");

        System.out.println("\n" + rb.get().getName() + " " + cb.get().getName() + " " + cb.get().getName() +" " + lb.get().getName());

        System.out.println("\n              " + gk.get().getName() + "         ");

    }
}
