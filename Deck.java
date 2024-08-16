package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<Card>();
    
    Deck() {
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                       "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      
        for(String suit : suits) {
            int i = 2;
            for(String name : names) {
                String fullName = name + " of " + suit;
                Card card = new Card(i, fullName);
                this.cards.add(card);
                i++;
            }
        }
        
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card draw() {
        Card card = this.cards.get(0);
        this.cards.remove(0);
        return card;
    }
  
}
