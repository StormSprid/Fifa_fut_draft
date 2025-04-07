package main.DraftTest;

import main.Draft.DraftEngine;
import main.Entities.Player;
import main.Entities.Position;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class DraftTest {

    @Test
    public void testPickPlayerWithValidInput() {

        String input = "2\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        List<Player> options = List.of(
                new Player("Messi", Position.ST, 92, "Inter Miami", "Argentina"),
                new Player("Mbappé", Position.ST, 91, "PSG", "France"),
                new Player("Haaland", Position.ST, 91, "Man City", "Norway"),
                new Player("Kane", Position.ST, 90, "Bayern", "England")
        );

        DraftEngine draft = new DraftEngine(); // допустим, там твой метод
        Player picked = draft.pickPlayer(options, scanner);

        assertNotNull(picked);
        assertEquals("Mbappé", picked.getName());
    }
}
