package job02;

public class Main
{
    public static void main(String[] args){

        String myUserInput = User.askName();
        System.out.println(String.format("Bonjour %s",myUserInput));
    }
}
