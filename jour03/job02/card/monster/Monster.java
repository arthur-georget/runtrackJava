package jour03.job02.card.monster;

import jour03.job02.card.Card;

public class Monster extends Card{
    private short maxHp;
    public short hp;
    private short strength;

    public Monster(String name, byte cost, short maxHp, short strength){
        super(name, cost);
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.strength = strength;
    }

    public short getStrength(){
        return this.strength;
    }

    public void restoreHp(){
        this.hp = this.maxHp;
    }

    public void display(){
        System.out.println(String.format("Type: %s\nNom: %s\nCoût: %s\nPV: %s\nForce: %s",
                            this.getClass().getName(),this.name,this.cost,this.hp,this.strength));
    }
}   
