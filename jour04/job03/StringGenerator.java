package jour04.job03;
import java.util.Random;

public class StringGenerator extends Thread{
    private int stringSize;
    private String randomString = "";
    private Random random = new Random();

    public StringGenerator(int stringSize){
        this.stringSize = stringSize;
    }

    public String getRandomString(){
        return this.randomString;
    }

    public void run(){
        for(int i = 0; i < stringSize; i++){
            this.randomString += (char)('0' + random.nextInt(74)); 
        }
    }
}
