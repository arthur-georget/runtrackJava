package jour04.job05;

public class Counter extends Thread{

    private long numberToCountTo;
    private long count = 0;

    public Counter(long numberToCountTo){
        this.numberToCountTo = numberToCountTo;
    }

    public long getCount(){
        return this.count;
    }

    public void run(){
        for (long i = 1; i <= numberToCountTo; i++){
            this.count++;
        }
    }
}
