package jour03.job02;
import jour03.job02.game.Game;
import jour03.job02.card.field.*;
import jour03.job02.card.monster.Monster;
import jour03.job02.card.spell.Spell;


public class Magic {
    public static void main(String[] args) {
        Game game = new Game();
        game.draw(new Field("Volcan", Color.NOIR));
        game.draw(new Monster("Hydre", (byte)4, (short)50, (short)10));
        game.draw(new Spell("Abracadabra", (byte)2, "Fais disparaître les lapins."));
        game.draw(new Field("Prairie", Color.VERT));
        game.draw(new Monster("Licorne", (byte)6, (short)200, (short)5));
        game.draw(new Spell("Embrouille", (byte)1,"Inflige des dégats émotionnels à l'adversaire."));
        game.draw(new Field("Marais", Color.BLEU));
        game.draw(new Monster("Nessie", (byte)1, (short)10, (short)150));
        game.draw(new Spell("HocusPocus",(byte)3, "Inflige des dégats magiques."));
        game.draw(new Monster("BigFoot", (byte)7, (short)30, (short)60));
        for (byte i = 0; i < 10; i++){
            game.play().display();
        }
    }
}
