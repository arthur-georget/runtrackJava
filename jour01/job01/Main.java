package job01;

public class Main
{
    public static void main(String[] args){

        String myUserInput = User.askInput();
        System.out.println(String.format("Vous avez écrit: %s",myUserInput));
    }
}
