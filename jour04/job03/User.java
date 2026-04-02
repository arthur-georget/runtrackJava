package jour04.job03;
import java.util.Scanner;

public class User {

    public static int askSize(){
        Scanner myScanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Renseignez une taille de chaîne de caractère à générer:");
                String userInput = myScanner.nextLine();
                int userNumber = Integer.parseInt(userInput);
                myScanner.close();
                return userNumber;
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre!");
            }    
        }
    }
}
