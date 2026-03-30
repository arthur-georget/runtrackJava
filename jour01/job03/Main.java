package job03;

public class Main {
    public static void main(String[] args) {
        byte[] myByteArray = {0,1,2,3,4,5,6,7,8,9,99};

        for (int i = 0; i < myByteArray.length+1; i++){
            System.out.println(String.format("T[%s] vaut %s.", i,myByteArray[i]));
        }
    }
}
