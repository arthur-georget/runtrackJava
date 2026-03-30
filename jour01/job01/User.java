package job01;
import java.util.Scanner;

public class User {

    public static String askInput(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Renseignez quelque chose:");
        String userInput = myScanner.nextLine();
        myScanner.close();
        return userInput;
    }
}
