package job08;

public class Main {
    public static void main(String[] args) {
        long n = User.askNumber();
        long sum = Number.sumFirstHundredCubes(n);
        System.out.println(String.format("La somme des %s premiers cube est %s.", n, sum));
    }
}
