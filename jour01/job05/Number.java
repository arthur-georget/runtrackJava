package job05;

public class Number {
    public static long biggestNumber(long[] myUserNumbers){
        long biggestNumber = myUserNumbers[0];
        for(byte i = 1; i < myUserNumbers.length; i++){
            if (biggestNumber < myUserNumbers[i]){
                biggestNumber = myUserNumbers[i];
            }
        }
        return biggestNumber;
    }
}
