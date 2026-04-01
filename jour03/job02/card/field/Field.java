package jour03.job02.card.field;

import jour03.job02.card.Card;

public class Field extends Card{
    private Color color;

    public Field(String name, Color color){
        super(name, (byte)0);
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void display(){
        System.out.println(String.format("Type: %s\nNom: %s\nCoût: %s\nCouleur: %s",
                            this.getClass().getName(),this.name,this.cost,this.color.getAcronym()));
    }
}
