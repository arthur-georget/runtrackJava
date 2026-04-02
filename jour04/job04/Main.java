package jour04.job04;
// Results count to 999 999 999 999
// 10541187400 / 4541693800 / 7114380300 / 6183310400
public class Main
{
    public static void main(String[] args){
        long start = System.nanoTime();
        long numberToCountTo = User.askNumberToCountTo();
         
        System.out.printf("Count: %s\n",Number.countTo(numberToCountTo));
        
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(String.format("The program took %s nanoseconds to run.", timeElapsed));
        
    }
}
