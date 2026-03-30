package job05;

public class Main {
    public static void main(String[] args) {
        long[] myUserNumbers = User.askNumbers();
        long biggestNumber = Number.biggestNumber(myUserNumbers);
        System.out.println(String.format("Le plus gros nombre fourni est %s.",biggestNumber));
    }
}
