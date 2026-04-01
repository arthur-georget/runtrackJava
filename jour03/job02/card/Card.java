package jour03.job02.card;

public abstract class Card {
    protected String name;
    protected byte cost;

    public Card(String name, byte cost){
        this.name = name;
        this.cost = cost;
        System.out.println(this.getClass().getName());
    }

    public abstract void display();
}
