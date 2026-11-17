package com.productsales;

/** Calculates sales statistics for a two-dimensional year/quarter sales array. */
public class ProductSales implements IProduct {

    /** Adds all quarterly sales across all years. */
    @Override
    public int TotalSales(int[][] productSales) {
        validateSales(productSales);
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    /** Calculates the arithmetic mean of every quarterly sale. */
    @Override
    public double AverageSales(int[][] productSales) {
        validateSales(productSales);
        int count = 0;
        for (int[] year : productSales) {
            count += year.length;
        }
        return (double) TotalSales(productSales) / count;
    }

    /** Finds the largest quarterly sales figure. */
    @Override
    public int MaxSale(int[][] productSales) {
        validateSales(productSales);
        int maximum = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > maximum) {
                    maximum = sale;
                }
            }
        }
        return maximum;
    }

    /** Finds the smallest quarterly sales figure. */
    @Override
    public int MinSale(int[][] productSales) {
        validateSales(productSales);
        int minimum = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < minimum) {
                    minimum = sale;
                }
            }
        }
        return minimum;
    }

    /** Rejects null or empty sales data before calculations begin. */
    private void validateSales(int[][] productSales) {
        if (productSales == null || productSales.length == 0) {
            throw new IllegalArgumentException("Sales data must not be empty.");
        }
        for (int[] year : productSales) {
            if (year == null || year.length == 0) {
                throw new IllegalArgumentException("Each year must have sales data.");
            }
        }
    }
}
