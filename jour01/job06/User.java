package job06;

import java.util.Scanner;

public class User {

    public static long[] askNumbers() {
        Scanner myScanner = new Scanner(System.in);
        long[] userNumbers = new long[5];
        byte i = 0;
        while (i < 5) {
            try {
                System.out.println(String.format("Renseignez le nombre %s:", i));
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
