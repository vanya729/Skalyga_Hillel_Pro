package RockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameVoidTest {

    @Test
    public void testResultInRound() {
        GameVoid gameVoid = new GameVoid("Vanya", 5);
        Item rock = Item.Rock;
        Item scissors = Item.Scissors;
        Item paper = Item.Paper;

        assertEquals("Draw", gameVoid.resultInRound(rock, rock));
        assertEquals("Draw", gameVoid.resultInRound(scissors, scissors));
        assertEquals("Draw", gameVoid.resultInRound(paper, paper));
        assertEquals("Player", gameVoid.resultInRound(rock, scissors));
        assertEquals("Player", gameVoid.resultInRound(scissors, paper));
        assertEquals("Player", gameVoid.resultInRound(paper, rock));
        assertEquals("Computer", gameVoid.resultInRound(rock, paper));
        assertEquals("Computer", gameVoid.resultInRound(scissors, rock));
        assertEquals("Computer", gameVoid.resultInRound(paper, scissors));
    }

    @Test
    void matrixWinner() {
        GameVoid gameVoid = new GameVoid("Vanya", 5);
        String[][] expected = {
                {"Draw", "Player", "Computer"},
                {"Computer", "Draw", "Player"},
                {"Player", "Computer", "Draw"}
        };
        assertEquals(expected[0][0], gameVoid.matrixWinner(0, 0));
        assertEquals(expected[1][2], gameVoid.matrixWinner(1, 2));
        assertEquals(expected[2][1], gameVoid.matrixWinner(2, 1));
    }


    @Test
    void getItemInMatrix() {
        GameVoid gameVoid = new GameVoid("Vanya", 5);
        assertEquals(0, gameVoid.getItemInMatrix(Item.Rock));
        assertEquals(1, gameVoid.getItemInMatrix(Item.Scissors));
        assertEquals(2, gameVoid.getItemInMatrix(Item.Paper));

    }
}