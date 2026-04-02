package jour04.job04;
import java.util.Scanner;

public class User {

    public static long askNumberToCountTo(){
        Scanner myScanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Provide a number to count to:");
                String userInput = myScanner.nextLine();
                long userNumber = Long.parseLong(userInput);
                myScanner.close();
                return userNumber;
            } catch (Exception e) {
                System.out.println("This is not a number!");
            }    
        }
    }
}
