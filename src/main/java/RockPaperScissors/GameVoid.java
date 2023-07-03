package RockPaperScissors;

import java.util.Scanner;

public class GameVoid {

    private final String name;
    private final int countGame;
    private int gamesPlayed = 0;
    private int gamesWon = 0;
    private int gamesLost = 0;
    private int gamesDraw = 0;

    public GameVoid(String name, int countGame) {
        this.name = name;
        this.countGame = countGame;
    }

    public String matrixWinner(int playerChoice, int computerChoice) {
        String[][] resultGame = {
                {"Draw", "Player", "Computer"},
                {"Computer", "Draw", "Player"},
                {"Player", "Computer", "Draw"}
        };
        return resultGame[playerChoice][computerChoice];
    }

    public void startGame(Scanner scanner){
        System.out.println("GAME STARTED");
        while (countGame > gamesPlayed){
            System.out.println("Choose your option (Rock - R, Scissors - S, Paper - P, or N to exit):");
            String plChoise = scanner.next().toUpperCase();
            if (plChoise.equals("N")){
                System.out.println("You are out of the game ");
                break;
            }
            if (!plChoise.equals("R") && !plChoise.equals("S") && !plChoise.equals("P")){
                System.out.println("Enter a valid value.Please try again.");
                continue;
            }

            Item itemPlayerChoise;
            Item computerItem =Computer.getRandomItemForComputer();


            switch (plChoise){
                case "R" :
                    itemPlayerChoise = Item.Rock;
                    break;
                case "S" :
                    itemPlayerChoise = Item.Scissors;
                    break;
                case "P" :
                    itemPlayerChoise = Item.Paper;
                    break;
                default:
                    throw new IllegalArgumentException("Enter a valid value.Please try again" + plChoise);
            }


            System.out.println("You choosed: "+itemPlayerChoise +itemPlayerChoise.getEmoji());
            System.out.println("Computer choosed: "+ computerItem+ computerItem.getEmoji());
            String result = resultInRound(itemPlayerChoise, computerItem);
            System.out.println(result);
            gamesPlayed++;

        }
    }

    public String resultInRound(Item personItem, Item computerItem){
        int playerItemMatrix = getItemInMatrix(personItem);
        int computerItemMatrix = getItemInMatrix(computerItem);
        String winner = matrixWinner(playerItemMatrix, computerItemMatrix);

        switch (winner){
            case "Draw":
                gamesDraw++;
                break;
            case "Player":
                gamesWon++;
                break;
            case  "Computer":
                gamesLost++;
                break;
        }
    return winner;
    }

    public int getItemInMatrix(Item item){
        switch (item){
            case Rock :
                return 0;
            case Scissors:
                return 1;
            case Paper:
                return 2;
            default:
                throw new IllegalArgumentException("Error" + item);
        }
    }

    public void resultOnDisplay(){
        System.out.println("Played games=" + gamesPlayed);
        System.out.println("Games won=" + gamesWon);
        System.out.println("Games lost=" + gamesLost);
        System.out.println("Games draw=" + gamesDraw);
    }

}
