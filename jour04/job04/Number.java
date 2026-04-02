package jour04.job04;

public class Number {
    public static long countTo(long numberToCountTo){
        long count = 0;
        for (long i = 1; i <= numberToCountTo; i++){
            count++;
        }
        return count;
    }
}
