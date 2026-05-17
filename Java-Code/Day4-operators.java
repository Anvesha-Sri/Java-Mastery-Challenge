import java.util.*;

public class Solution {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static int solve(double meal_cost, int tip_percent, int tax_percent) {
        // Calculate tip and tax
        double tip = meal_cost * tip_percent / 100.0;
        double tax = meal_cost * tax_percent / 100.0;

        // Calculate total cost
        double total_cost = meal_cost + tip + tax;

        // Return rounded value
        return (int) Math.round(total_cost);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read inputs
        double meal_cost = scan.nextDouble(); // Use nextDouble here!
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();

        // Solve and print
        int total_cost = solve(meal_cost, tip_percent, tax_percent);
        System.out.println(total_cost);

        scan.close();
    }
}
