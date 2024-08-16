package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Card> hand = new ArrayList<Card>();
    int score;
    String name;
    
    Player(String needName) {
        this.name = needName;
    }
    
    public void describe() {
            System.out.print(name + " has a(n) " + this.hand.get(0).describe());
            this.hand.remove(0);
    }
    
    public Card flip() {
        Card topCard = this.hand.get(0);
        return topCard;
    }
    
    public void draw(Deck deck) {
        Card card = deck.draw();
        hand.add(card);
    }
    
    public void incrementScore() {
        this.score++;
    }
    
    public List<Card> getHand() {
        return hand;
    }
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
