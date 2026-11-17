# Rubric verification — Question 1 (screenshots supplied)

| Criterion | Evidence | Status |
|---|---|---|
| Printing rows and columns (5 marks) | `ProductSalesReport.java` uses `years[]`, `sales[][]`, nested loops and formatted table | Implemented |
| Printing/calculating total and average (5 marks) | `TotalSales`, `AverageSales`, printed with labels | Implemented |
| Printing/calculating highest and lowest (5 marks) | `MaxSale`, `MinSale`, printed with labels | Implemented |
| ProductSales class implements IProduct (5 marks) | `ProductSales implements IProduct`, all four signatures | Implemented |
| Total sales unit test (5 marks) | `CalculateTotalSales_ReturnsTotalSales` in test package | Implemented |
| Average sales unit test (5 marks) | `AverageSales_ReturnsAverageProductSales` in test package | Implemented |
| Good programming practice (3 marks, general rubric) | Clear class structure, private validation helper, meaningful variable names | Implemented |
| Code efficiency (2 marks, general rubric) | Reusable methods, no duplicated calculation code | Implemented |
| Comment statements (3 marks, general rubric) | Javadoc and explanatory comments | Implemented |
| Compile and execute (2 marks, general rubric) | Source compiled and run with javac/java; see expected output | Verified locally |

## Important clarification
The screenshot's Q1.2 paragraph calls the interface `IProductSales` but its supplied code declares `IProduct`. The project follows the actual supplied interface code (`IProduct`) and preserves the method names exactly (`TotalSales`, `AverageSales`, `MaxSale`, `MinSale`).

## Unit tests
The screenshot asks specifically for the total and average tests. Both are present with the test names as printed in the screenshot (without line-wrap splits). Two additional extrema tests and one empty-input test provide more coverage.

## Scope
This checklist checks only the visible screenshots (pages 4–8). Any instructions on unseen pages should be checked before final submission. Local compilation and execution are verified; automated JUnit execution requires Maven/JUnit dependencies and may need to be run in your IDE.
