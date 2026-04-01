package jour03.job00;
import jour03.job00.a.A;
import jour03.job00.a.b.B;
import jour03.job00.a.c.C;

public class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        //tab[0] = new A(); // A is an abstract class, you can't instantiate it
        tab[1] = new B(); 
        tab[2] = new C();
        //tab[1].b = 2; // A class has no attribute b you should cast tab[1] instance to B to access ((B)tab[1]).b attribute
        //((C)tab[2]).c = 3; // C.c attribute is a constant (final) so you cannot change its value
    }
}
