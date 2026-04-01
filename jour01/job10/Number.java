package job10;

public class Number {
    static long factorial(long number){
        long result = 1;
        for(long i = number; i > 0; i--){
            result*=i;
        }
        return result;
    }
}
