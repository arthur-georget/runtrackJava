package jour04.job02;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args){
        long start = System.nanoTime();

        int stringSize = User.askSize();
        String keyPath = System.getProperty("user.dir") + "\\key.txt";
        StringGenerator stringGenerator = new StringGenerator(stringSize);
        stringGenerator.start();
        synchronized (stringGenerator){
            try{ 
                System.out.println("Waiting for stringGenerator to complete...");
                stringGenerator.wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            try {
                FileWriter writer = new FileWriter(keyPath);
                writer.write(stringGenerator.getRandomString());
                System.out.println("Key written to the file successfully.");
                writer.close();
            }
            catch (IOException e){
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
            System.out.println(keyPath);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(String.format("The program took %s nanoseconds to run.", timeElapsed));
        
    }
}
