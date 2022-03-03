package lambdas;
import java.util.function.BiConsumer;

public class BiConsumerFunction {
    BiConsumer<EmployeeId,Integer> empBonusConsumer =
            (emp,bonus)-> System.out.printf("Employee %s is set of %d pct of bonus:", emp,bonus);

    BiConsumer<EmployeeId,Integer> empSalaryHikeConsumer =
            (emp,sal)-> System.out.printf("Employee %s is receiving  %d hike in salary:", emp,sal);

    BiConsumer<EmployeeId,Integer> empBonusAndHikeConsumer = empBonusConsumer.andThen(empSalaryHikeConsumer);

    private void testBiConsumer(EmployeeId emp, Integer bonus, Integer salaryHike){
        empBonusConsumer.accept(emp,bonus);
    }

    public static void main(String[] args) {
        EmployeeId emp = new EmployeeId(10);
        int bonus = 5;
        int salaryHike =15;
        new BiConsumerFunction().testBiConsumer(emp,bonus,salaryHike);
    }
}