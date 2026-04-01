package job10;

public class Main {
    public static void main(String[] args) {
        long n = User.askNumber();
        long result = Number.factorial(6);
        System.out.println(String.format("La factorielle de %s est %s.",n,result));
    }
}
