public class SalaryAdjustment {
    public static void main(String[] args) {
        double[] salaries = { 400.00, 800.01, 2000.00 };

        for (double salary : salaries) {
            double percentage = 0.0;

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

            double reajuste = salary * (percentage / 100);
            double novoSalario = salary + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n\n", percentage);
        }
    }
}
