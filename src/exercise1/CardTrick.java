package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * This is branch code
 * @author Henry Tran
 * @author Henry Tran Jan 23, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
	    card.setValue((int)Math.floor(Math.random()*13+1));

            //card.setValue(insert call to random number generator here)
            // 
            card.setSuit(Card.SUITS[(int)Math.floor(Math.random()*4)]);
		
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        Scanner inp = new Scanner(System.in);
	
	System.out.println("Please input a value between 1-13 for card value, Ace is 1, Jack is 11, Queen is 12, King is 13");
	
	int value = inp.nextInt();
	
	System.out.println("Please input a value for the suit between 1-4, 1 is Hearts, 2 is Diamonds, 3 is Spades, 4 is Clubs");
	
	int suit = inp.nextInt();
	
	Card guess = new Card();
	guess.setValue(value);
	guess.setSuit(Card.SUITS[suit-1]);
        
        System.out.println("Your Card is " + guess.getValue() + " of " + guess.getSuit());
        
        for(int i = 0; i < hand.length; i++) {
           if (hand[i].getValue()==guess.getValue()){
           if (hand[i].getSuit().equals(guess.getSuit())){
               printInfo();
               break;
           }
        }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Henry");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Working Out");
        System.out.println("-- Playing Games");
        System.out.println("-- Reading");
        System.out.println("-- Riding my motorcycle")
		
        System.out.println();
        
    
    }

}
