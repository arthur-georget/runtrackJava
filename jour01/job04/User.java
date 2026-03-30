package job04;
import java.util.Scanner;

public class User {

    public static long askNumber(){
        Scanner myScanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Renseignez un nombre à mettre au carré:");
                String userInput = myScanner.nextLine();
                long userNumber = Long.parseLong(userInput);
                myScanner.close();
                return userNumber;
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre!");
            }    
        }
    }
}
