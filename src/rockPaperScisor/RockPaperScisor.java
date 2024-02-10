package rockPaperScisor;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScisor {
  public static String winner(String player, String computer) {
    if (player.equals(computer)) {
      return "The game is tied";
    } else if (player.equals("Rock") && computer.equals("Paper")
        || (player.equals("Paper")) && computer.equals("Scissors")
        || (player.equals("Scissors")) && computer.equals("Rock")) {
      return "Player";
    } else {
      return "Computer";
    }
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    int gameRounds;
    int scoreOfPlayer = 0;
    int scoreOfComputer = 0;

    do {
      System.out.println("Enter your game round or (0) to EXIT: ");
      gameRounds = scan.nextInt();

      for (int i = 1; i <= gameRounds; i++) {
        gameRounds++;
        System.out.println("Round " + i);
        System.out.println("Enter your choice: (Rock, Paper, Scissors) ");
        String choiceOfplayer = scan.next().toLowerCase();

        String[] choice = { "Rock", "Paper", "Scissors" };
        int randomNumber = random.nextInt(choice.length);
        String choiceOFcomputer = choice[randomNumber];
        System.out.println("Player choice is: " + choiceOfplayer);
        System.out.println("Computer choice is: " + choiceOFcomputer);

        String gameResult = winner(choiceOfplayer, choiceOFcomputer);
        if (gameResult.equals("Player")) {
          scoreOfPlayer++;
        } else if (gameResult.equals("Computer")) {
          scoreOfComputer++;
        }
        System.out.println("Game result : " + gameResult + " win");
        System.out.println("Player score : " + scoreOfPlayer);
        System.out.println("Computer score : " + scoreOfComputer);

        System.out.println("Game result: ");
        if (scoreOfPlayer > scoreOfComputer) {
          System.out.println("Player has won!");
        } else if (scoreOfPlayer < scoreOfComputer) {
          System.out.println("Comoputer win!");
        } else {
          System.out.println("No one has won");
        }
        System.out.println("Round : " + gameRounds);
        System.out.println("Player score : " + scoreOfPlayer);
        System.out.println("Computer score : " + scoreOfComputer);

      }

    } while (gameRounds == 0);
    System.exit(0);
  }
}
