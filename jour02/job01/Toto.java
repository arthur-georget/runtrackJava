package jour02.job01;

class Toto {
    private int toto = 0;
    Toto(){
        toto = toto + 1;
    }
    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        //System.out.println("Toto:" + toto);
        System.out.println("Cannot make a static reference to the non-static field toto.");
        System.out.println("t1.toto:" + t1.toto);
        System.out.println("t2.toto:" + t2.toto);
    }
}
