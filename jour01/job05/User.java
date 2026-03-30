package job05;

import java.util.Scanner;

public class User {

    public static long[] askNumbers(){
        Scanner myScanner = new Scanner(System.in);
        long[] userNumbers = new long[3];
        byte i = 0;
        while(i<3){
            try {
                System.out.println(String.format("Renseignez un nombre %s:",i));
                String userInput = myScanner.nextLine();
                userNumbers[i] = Long.parseLong(userInput);
                i++;
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre!");
            }    
        }
        myScanner.close();
        return userNumbers;
    }
}
