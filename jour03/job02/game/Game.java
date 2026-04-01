package jour03.job02.game;
import jour03.job02.card.Card;

public class Game {
    private Card[] deck;

    public Game(){
        this.deck = new Card[10];
    }

    public void draw(Card card){
        for (byte i = 0; i < this.deck.length; i++){
            if(this.deck[i] == null){
                this.deck[i] = card;
                break;
            }
        }
    }

    public Card play(){
        for (byte i = 0; i < this.deck.length; i++){
            if(i > 0 && this.deck[i] == null){
                Card card = this.deck[i-1];
                this.deck[i-1] = null;
                return card;
            }else if (i == this.deck.length-1){
                Card card = this.deck[i];
                this.deck[i] = null;
                return card;
            }
        }
        return null;
    }
}
