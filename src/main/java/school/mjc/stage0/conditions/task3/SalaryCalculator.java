package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float exitSalary = 0;
        if (salary<0) {
            System.out.println("wrong input!");
            return;
        } else if (salary<=10000) {
            exitSalary = (float) (salary * 0.85);
        } else if (salary>10000 && salary <= 20000) {
            exitSalary = (float) (salary * 0.82);
        } else if (salary>20000) {
            exitSalary = (float) (salary * 0.8);
        }
        System.out.println(exitSalary);

    }
}
