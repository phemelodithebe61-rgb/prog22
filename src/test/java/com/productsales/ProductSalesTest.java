package com.productsales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Unit tests for the required total and average sales methods. */
public class ProductSalesTest {
    private final ProductSales calculator = new ProductSales();
    private final int[][] sales = {{300, 150, 700}, {250, 200, 600}};

    /** Q1.3: Checks that TotalSales returns the correct sum. */
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        assertEquals(2200, calculator.TotalSales(sales));
    }

    /** Q1.3: Checks that AverageSales returns the correct average. */
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        assertEquals(2200.0 / 6, calculator.AverageSales(sales), 0.000001);
    }

    /** Additional test: verifies the maximum quarterly sale. */
    @Test
    public void MaxSale_ReturnsMaximumSale() {
        assertEquals(700, calculator.MaxSale(sales));
    }

    /** Additional test: verifies the minimum quarterly sale. */
    @Test
    public void MinSale_ReturnsMinimumSale() {
        assertEquals(150, calculator.MinSale(sales));
    }

    /** Additional test: checks that an empty dataset is rejected. */
    @Test
    public void EmptySales_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.TotalSales(new int[0][]));
    }
}
