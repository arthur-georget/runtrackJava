package job04;

public class Main
{
    public static void main(String[] args){

        long myUserNumber = User.askNumber();
        long result = myUserNumber*myUserNumber;
        System.out.println(String.format("%s au carré est égal à %s.",myUserNumber,result));
    }
}
