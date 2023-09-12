/*
 * Author: oof4dayz
 * File: QuadraticSolver.java
 * Date: Open-sourced 9/12/2023, originally written sometime in 2020
 * Description: Finds the solution(s) of any quadratic equation.
 * The main method present tests this functionality
 */

public class QuadraticSolver
{
    public static void main(String[] args) {
        // Test a quadratic equation with two real solutions, x^2 - 6x + 5 = 0
        solveQuadEquation(1, -6, 5);

        // Test a quadratic equation with only one real solution, -4x^2 + 12x - 9 = 0
        solveQuadEquation(-4, 12, -9);

        // Test a quadratic equation with two imaginary solutions, 6.2x^2 + 5.1x + 29.3 = 0.
        solveQuadEquation(6.2, 5.1, 29.3);
    }

    /**
     * This method prints the solution(s) of any quadratic
     * equation in the form ax^2 + bx + c = 0.
     *
     * @param a - double value representing the a constant
     * @param b - double value representing the b constant
     * @param c - double value representing the c constant
     */
    private static void solveQuadEquation(double a, double b, double c)
    {
        // Predetermine the value in square root for real solution check. (aka the discriminant)
        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant < 0)
        {
            // All quadratics with a discriminant less than 0 will have two imaginary solutions
            System.out.printf("%nApproximate imaginary solutions of quadratic equation with values a = %s, b = %s, and c = %s:", a, b, c);
            System.out.printf("%nSolution 1 (adding square root) = %s + %si", -b / (2*a), Math.sqrt(Math.abs(discriminant)) / (2*a));
            System.out.printf("%nSolution 2 (subtracting square root) = %s - %si", -b / (2*a), Math.sqrt(Math.abs(discriminant)) / (2*a));
            System.out.printf("%n");
        }
        else if (discriminant == 0)
        {
            // All quadratics with a discriminant equal to 0 get the same result whether you add or subtract -b
            System.out.printf("%nApproximate real solution of quadratic equation with values a = %s, b = %s, and c = %s:", a, b, c);
            System.out.printf("%nSolution 1 (adding or subtracting square root) = %s", (-b + Math.sqrt(discriminant)) / (2*a));
            System.out.printf("%n");
        }
        else
        {
            // All quadratics with a discriminant greater than 0 will have two real solutions
            System.out.printf("%nApproximate real solutions of quadratic equation with values a = %s, b = %s, and c = %s:", a, b, c);
            System.out.printf("%nSolution 1 (adding square root) = %s", (-b + Math.sqrt(discriminant)) / (2*a));
            System.out.printf("%nSolution 2 (subtracting square root) = %s", (-b - Math.sqrt(discriminant)) / (2*a));
            System.out.printf("%n");
        }
    }
}
