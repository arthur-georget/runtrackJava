package jour04.job06;

import java.util.Scanner;
import java.util.ArrayList;

public class User {

    public static ArrayList<Long> askNumbers(){
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Long> userNumbers = new ArrayList<Long>();
        while(true){
            try {
                System.out.println("Provide a number (provide nothing to stop):");
                String userInput = myScanner.nextLine();
                if (userInput == ""){
                    break;
                } else {
                    userNumbers.add(Long.parseLong(userInput));
                }
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre!");
            }    
        }
        myScanner.close();
        return userNumbers;
    }
}
