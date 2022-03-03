package lambdas;
public class FunctionalInterface {

    @java.lang.FunctionalInterface
    interface Multiplier{
        int multiply(int i,int j);
    };

    Multiplier multiplierLambda = (p,q)->p*q;

    public static void main(String[] args) {
        FunctionalInterface client = new FunctionalInterface();
    }
}