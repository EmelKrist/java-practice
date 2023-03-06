package _7kyuTests;

import _7kyu.RockPaperScissorsLizardSpock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorsLizardSpockTest {
    @Test
    void player1Wins() {
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("spock", "rock"));
    }

    @Test void player2Wins() {
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("lizard","scissors"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("spock","lizard"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("paper","lizard"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("scissors","spock"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("rock","spock"));
    }

    @Test void draws() {
        assertEquals("Draw!", RockPaperScissorsLizardSpock.rpsls("rock", "rock"));
        assertEquals("Draw!", RockPaperScissorsLizardSpock.rpsls("spock", "spock"));
    }
}
