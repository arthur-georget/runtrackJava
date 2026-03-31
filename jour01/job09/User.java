package job09;

import java.util.Scanner;

public class User {

    private byte userAge;
    private enum eMajority{
        MAJEUR,
        MINEUR
    };
    private eMajority majority;

    public User(byte age) {
        userAge = age;
        majority = isItMajority(age);
    }

    public static byte askAge() {
        Scanner myScanner = new Scanner(System.in);
        byte userNumber = 0;
        while (userNumber <=0) {
            System.out.println("Votre âge doit être supérieur ou égal à 0.");
            try {
                System.out.println("Renseignez votre âge:");
                String userInput = myScanner.nextLine();
                userNumber = Byte.parseByte(userInput);
            } catch (Exception e) {
                System.out.println("Ce n'est pas possible!");
            }
        }
        myScanner.close();
        return userNumber;
    }

    private eMajority isItMajority(byte age) {
        if (age >= 18) {
            return eMajority.MAJEUR;
        } else {
            return eMajority.MINEUR;
        }
    }

    public void presentation(){
        System.out.println(String.format("Vous avez %s ans et vous êtes %s.",this.userAge,this.majority.name().toLowerCase()));
    }
}
