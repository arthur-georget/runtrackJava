package job00;

public class Main
{
    public static void main(String[] args){
        char myChar = 'a';
        String myString = "Hello!";
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;
        float myFloat = 0.123456f;
        double myDouble = 0.1234567891234;
        // int TOTO = 3.817;
        // Type mismatch: cannot convert from double to int

        System.out.println("Hello World");
        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
}