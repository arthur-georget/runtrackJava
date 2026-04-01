package jour03.job02.card.spell;

import jour03.job02.card.Card;

public class Spell extends Card{
    private String description;

    public Spell(String name, byte cost, String description){
        super(name, cost);
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void display(){
        System.out.println(String.format("Type: %s\nNom: %s\nCoût: %s\nDescription: %s",
                        this.getClass().getName(),this.name,this.cost,this.description));
    }
}
