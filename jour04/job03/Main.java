package jour04.job03;
import java.io.FileWriter;
import java.io.IOException;
// Results for 250 000 characters generation:
// 6514306000 / 5715089300 / 5696265300 / 5656798100 / 6579494200
public class Main
{
    public static void main(String[] args){
        long start = System.nanoTime();

        int stringSize = User.askSize();
        String keyPath = System.getProperty("user.dir") + "\\output.txt";
        String generatedString = "";
        StringGenerator[] stringGenerators = {new StringGenerator(stringSize/2),new StringGenerator(stringSize/2)};
        
        for(StringGenerator stringGenerator : stringGenerators){
            stringGenerator.start();
        }
        System.out.println("Waiting for stringGenerators to complete...");
        for(StringGenerator stringGenerator : stringGenerators){
            try{
                stringGenerator.join();
                generatedString += stringGenerator.getRandomString();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
       
        try {
            FileWriter writer = new FileWriter(keyPath);
            writer.write(generatedString);
            System.out.println("Key written to the file successfully.");
            writer.close();
        }
        catch (IOException e){
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        System.out.println(keyPath);
        
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(String.format("The program took %s nanoseconds to run.", timeElapsed));
    }
}
