package com.productsales;

/** Entry point: displays quarterly sales and the two-year product sales report. */
public class ProductSalesReport {
    public static void main(String[] args) {
        // Single-dimensional array containing the two reporting year labels.
        String[] years = {"YEAR 1", "YEAR 2"};

        // Two-dimensional array: rows are years; columns are quarters 1, 2 and 3.
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Display each year and quarter in an aligned table.
        System.out.println("PRODUCT SALES BY QUARTER");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %12s %12s %12s%n", "", "QUARTER 1", "QUARTER 2", "QUARTER 3");
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-10s", years[row]);
            for (int quarter = 0; quarter < sales[row].length; quarter++) {
                System.out.printf(" %12d", sales[row][quarter]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");

        // Calculate the required statistics using the interface implementation.
        IProduct calculator = new ProductSales();
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("------------------------------");
        System.out.printf("Total sales:   %d%n", calculator.TotalSales(sales));
        System.out.printf("Average sales: %.0f%n", calculator.AverageSales(sales));
        System.out.printf("Maximum sale:  %d%n", calculator.MaxSale(sales));
        System.out.printf("Minimum sale:  %d%n", calculator.MinSale(sales));
        System.out.println("------------------------------");
    }
}
