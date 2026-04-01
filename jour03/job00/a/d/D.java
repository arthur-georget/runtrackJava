package jour03.job00.a.d;

import jour03.job00.a.A;

public abstract class D extends A{
    private double d;
    public int operation(int a){
        return (a*2);
    }
    public abstract int calcul(int b); // Abstract methods do not specify a body
}
