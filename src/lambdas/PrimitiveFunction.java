package lambdas;
import java.util.function.*;

public class PrimitiveFunction {
    //Predicates
    IntPredicate evenNumberPredicate = x->x%2==0;
    DoublePredicate doublePredicate = x->x>10;
     LongPredicate longPredicate = null;

    //Consumer
    IntConsumer intConsumer = null;
    DoubleConsumer doubleConsumer = null;
    LongConsumer longConsumer = null;

    //Supplier
    IntSupplier intSupplier = null;
    DoubleSupplier doubleSupplier = null;
    LongSupplier longSupplier = null;

    //Functions
    Function<Integer,Employee> empFunction=null;
    IntFunction<Employee> intEmpFunction;
    DoubleFunction<Employee> doubleEmpFunction;
    LongFunction<Employee> longEmployeeFunction;

    //double and int
    Function<Double,Integer> doubleIntegerFunction=null;
    DoubleFunction<Integer> integerDoubleFunction;

    //primitive to primitive
    DoubleToIntFunction doubleToIntFunction;

    private void testPredicate(int i){
        System.out.println("Even number?"+evenNumberPredicate.test(i));
    }

    public static void main(String[] args) {
        int evenNum = 20;
        new PrimitiveFunction().testPredicate(evenNum);
    }
}