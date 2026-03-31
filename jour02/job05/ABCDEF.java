package jour02.job05;

import jour02.job05.a.A;
import jour02.job05.a.b.B;
import jour02.job05.a.b.c.C;
import jour02.job05.a.d.D;
import jour02.job05.a.d.e.E;
import jour02.job05.a.d.f.F;

public class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b; // b is an instance of B and A as B inherits from A
        //b = a; // but a is not an instance of B, we cannot convert a to B
        a = (A) b;
        a = null;
        //null = a; we can't assign anything to null 
        a = d; // d is an instance of D and A as D inherits from A
        //b = d; // but d is not an instance of B, there is no relation between B and D
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        search(as);
        add(as);
    }

    private static void search(A[] as){
        byte count = 0;
        for(A element : as){
            if (element instanceof B){
                count++;
            }
        }
        System.out.println(String.format("Il y a %s instances de la classe B.",count));
    }

    private static void add(A[] as){
        byte sum = 0;
        for(A element : as){
            if (element instanceof D){
                //sum += element;
            }
        }
        System.out.println(String.format("Somme des variables d: %s",sum));
    }
}
