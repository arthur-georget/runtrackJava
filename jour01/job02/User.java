package job02;
import java.util.Scanner;

public class User {

    public static String askName(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Comment vous appelez vous?");
        String userName = myScanner.nextLine();
        myScanner.close();
        return userName;
    }
}
