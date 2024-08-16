package week06;

public class App {

  public static void main(String[] args) {
      
      System.out.println("Creating new deck!");
      Deck deck = new Deck();
      
      System.out.println("Players get ready!");
      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");
      
      System.out.println("Shuffling the deck!");
      deck.shuffle();
      
      System.out.println("Handing out cards!");
      for(int i = 0; i < 52; i++) {
          if (i % 2 != 0) {
              player1.draw(deck);
          } else {
              player2.draw(deck);
          }
      }
      
      System.out.println("\nReady, Set, Play!");
      for(int x = 0; x < 26; x++) {
          if (player1.flip().getValue() > player2.flip().getValue()) {
              player1.incrementScore();
              player1.describe();
              System.out.print(" and ");
              player2.describe();
              System.out.print(".");
              System.out.println("\nPlayer 1 won! The score is " + player1.score + " vs. " + player2.score + ".");
          } else if (player1.flip().getValue() < player2.flip().getValue()) {
              player2.incrementScore();
              player2.describe();
              System.out.print(" and ");
              player1.describe();
              System.out.print(".");
              System.out.println("\nPlayer 2 won! The score is " + player1.score + " vs. " + player2.score + ".");
          } else if (player1.flip().getValue() == player2.flip().getValue()) {
              System.out.println("It's a draw! :O");
              player1.hand.remove(0);
              player2.hand.remove(0);
          } else {
              System.out.println("Something went wrong!!");
          }
      }
      
      System.out.println("\nPlayer 1 has " + player1.score + " points");
      System.out.println("Player 2 has " + player2.score + " points");
      
      if (player1.score > player2.score) {
          System.out.println("\nPlayer 1 won with a " + (player1.score - player2.score) + " point difference!!");
      } else if (player1.score < player2.score) {
          System.out.println("\nPlayer 2 won with a " + (player2.score - player1.score) + " point difference!!");
      } else if (player1.score == player2.score) {
          System.out.println("\nIt's a tie ;(");
      } else {
          System.out.println("\nSomething went wrong :O");
      }
      
  }

}
