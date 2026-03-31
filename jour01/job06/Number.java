package job06;

public class Number {
    public static long getAverage(long[] myUserNumbers) {
        long sum = 0;
        for (long myUserNumber : myUserNumbers) {
            sum += myUserNumber;
        }
        long average = sum / myUserNumbers.length;
        return average;
    }
}
