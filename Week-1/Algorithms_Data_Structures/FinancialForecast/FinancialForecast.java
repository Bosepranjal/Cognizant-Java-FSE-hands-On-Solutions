package FinancialForecast;             //(task-3): Implementation – Recursive Algorithm

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case: No more years to grow
        if (years == 0) {
            return principal;
        }
        // Recursive case: compound interest applied each year
        return calculateFutureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double principal = 10000; // Initial investment
        double annualGrowthRate = 0.10; // 10% annual growth
        int years = 5;

        double futureValue = calculateFutureValue(principal, annualGrowthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f%n", years, futureValue);
    }
}


/* Output of the code :   Future value after 5 years: ₹16105.10       */
