package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        double tax = 20.;
        if (salary <= 10000) {
            tax = 15.;
        } else if (salary <= 20000) {
            tax = 18.;
        }
        System.out.println(salary - salary * tax / 100);
    }
}
