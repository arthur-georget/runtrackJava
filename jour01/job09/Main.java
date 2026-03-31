package job09;

public class Main {
    public static void main(String[] args) {
        byte userAge = User.askAge();
        User myUser = new User(userAge);
        myUser.presentation();
    }
}
