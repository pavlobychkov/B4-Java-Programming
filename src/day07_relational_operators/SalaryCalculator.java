package day07_relational_operators;

public class SalaryCalculator{

    public static void main (String [] args){

        double baseSalary = 120_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;
        stateTaxAmount = baseSalary * stateTaxRate;
        federalTaxAmount = baseSalary * federalTaxRate; // Arithmetic operator
        totalTaxAmount = stateTaxAmount * federalTaxRate;
        salaryAfterTax = baseSalary - totalTaxAmount;
        System.out.println("Tax info: \n\tBase Salary: $" + baseSalary + "\n\tState Tax Rate: \t" + stateTaxRate );



    }
}
