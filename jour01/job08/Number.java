package job08;

public class Number {
    public static int sumFirstHundredCubes(long n) {
        int sum = 0;
        for (byte i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }
        return sum;
    }
}