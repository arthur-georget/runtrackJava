package jour03.job02.card.field;

public enum Color {
    BLANC("B"),
    BLEU("b"),
    NOIR("n"),
    ROUGE("r"),
    VERT("v");

    private String acronym;

    private Color(String acronym){
        this.acronym = acronym;
    }

    public String getAcronym(){
        return acronym;
    }
}
