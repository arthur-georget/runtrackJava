package job06;

public class Main {
    public static void main(String[] args) {
        long[] numbers = User.askNumbers();
        long average = Number.getAverage(numbers);
        System.out.println(String.format("La moyenne est %s.", average));
    }
}
