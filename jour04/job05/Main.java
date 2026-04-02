package jour04.job05;
// Results count to 999 999 999 999
// 6470135900 / 5233902300 / 4583699500 / 6853959000
public class Main
{
    public static void main(String[] args){
        long start = System.nanoTime();
        long numberToCountTo = User.askNumberToCountTo();
        long count = 0;
        
        Counter[] counters = {new Counter(numberToCountTo/2),
                              new Counter(numberToCountTo/2)};
        for (Counter counter : counters){
             counter.start();
        }
        for (Counter counter : counters){
            try{
                counter.join();
                count += counter.getCount();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("Total count: ",count);

        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(String.format("The program took %s nanoseconds to run.", timeElapsed));
    }
}
