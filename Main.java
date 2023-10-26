import java.util.Scanner;
import java.util.*;
public class Main {
public static void main(String[] args) {
System.out.println("Blackjack game - use y or n to make choices.");
String anotherCard, playAgain = "y", ctn = null;
int nextCard, playerCard1, playerCard2, dealerCard1, dealerCard2;
int cardTotal = 0, dTotal = 0;
Scanner keyboard = new Scanner(System.in);
Random random = new Random();
  
while ("y".equals(playAgain)) {
dealerCard1 = random.nextInt(10) + 1;
dealerCard2 = random.nextInt(10) + 1;
playerCard1 = random.nextInt(10) + 1;
playerCard2 = random.nextInt(10) + 1;
int playerCardTotal = playerCard1 + playerCard2;
int dealerCardTotal = dealerCard1 + dealerCard2;
System.out.println("Dealer shows: " + dealerCard1);
System.out.println("First Cards: " + playerCard1 + ", " + playerCard2);
System.out.println("Total: " + playerCardTotal);
System.out.println("Another Card (y/n)?: ");
anotherCard = keyboard.nextLine();
while ("y".equals(anotherCard)) {
nextCard = random.nextInt(10) + 1;
playerCardTotal += nextCard;
System.out.println("Card: " + nextCard);
System.out.println("Total: " + playerCardTotal);
if (cardTotal > 21)
System.out.println("You busted, Dealer wins");
System.out.println("Do you want to play again? (y/n):");
playAgain = keyboard.nextLine();
if (cardTotal < 21)
System.out.println("Another Card (y/n)?: ");
anotherCard = keyboard.nextLine();
if ("n".equals(anotherCard))
System.out.println("Dealer had: " + dealerCardTotal);
System.out.println("You had: " + playerCardTotal);
while ("n".equals(anotherCard)) {
if (dTotal < playerCardTotal && playerCardTotal <= 21) { System.out.println("Yay you win!");
System.out.println("Play again? (y/n): ");
}
playAgain = keyboard.nextLine();
System.out.println("Play again? (y/n): ");
playAgain = keyboard.nextLine();
if (playAgain.equals("y"));

if (dTotal > playerCardTotal && dealerCardTotal < 21);
System.out.println("You lose!");
if (playAgain.equals("y"));
if (playAgain.equals("n")); {
  int count = 0, wins = 0, losts = 0, ties = 0;
  System.out.println("Games played: " + count);
  System.out.println("Wins for you: " + wins);
  System.out.println("Wins for me: " + losts);
  System.out.println("Tied games: " + ties);
}
}
}
}
}
}