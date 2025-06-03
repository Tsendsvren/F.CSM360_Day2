import java.util.Scanner;

public class SalaryAdjustment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double percentage;

        if (salary <= 400.00) {
            percentage = 15.0;
        } else if (salary <= 800.00) {
            percentage = 12.0;
        } else if (salary <= 1200.00) {
            percentage = 10.0;
        } else if (salary <= 2000.00) {
            percentage = 7.0;
        } else {
            percentage = 4.0;
        }

        double increase = salary * (percentage / 100);
        double newSalary = salary + increase;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", increase);
        System.out.printf("Em percentual: %.0f %%\n", percentage);
    }
}
