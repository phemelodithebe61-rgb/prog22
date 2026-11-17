# Product Sales Report — PROG6112 Question 1

A complete Java project for Q1.1–Q1.3 from the supplied screenshots. Compatible with Java 17+ and Maven (or a Java IDE that supports Maven, including NetBeans and IntelliJ IDEA).

## How to run in NetBeans
1. Unzip `ProductSalesProject.zip`.
2. Open Apache NetBeans, choose **File > Open Project**, and select the `ProductSalesProject` folder containing `pom.xml`.
3. Allow Maven to download dependencies (internet required for the first JUnit test run).
4. Right-click `ProductSalesReport.java` and select **Run File**, or run the project with `mvn compile exec:java`.
5. Right-click the project and select **Test**, or run `mvn test`.

## Run without Maven
From the project root, run:

```bash
mkdir -p out
javac -d out src/main/java/com/productsales/*.java
java -cp out com.productsales.ProductSalesReport
```

JUnit tests need Maven/JUnit 5. The application itself needs only Java.

## Data

| Year | Quarter 1 | Quarter 2 | Quarter 3 |
|---|---:|---:|---:|
| Year 1 | 300 | 150 | 700 |
| Year 2 | 250 | 200 | 600 |

Expected total = 2200; exact average = 366.666666... (shown rounded to 367); maximum = 700; minimum = 150.

## Files
- `src/main/java/com/productsales/IProduct.java` — required interface with exact method signatures shown in Q1.2.
- `src/main/java/com/productsales/ProductSales.java` — implements all four methods.
- `src/main/java/com/productsales/ProductSalesReport.java` — application entry point and report.
- `src/test/java/com/productsales/ProductSalesTest.java` — JUnit 5 tests including the two named in Q1.3.
- `docs/RUBRIC_CHECKLIST.md` — mapping of screenshot criteria to evidence.
- `docs/EXPECTED_OUTPUT.txt` — reference console output.

Note: The Q1.2 prose says `IProductSales`, but the supplied interface declaration explicitly says `public interface IProduct`. This project uses **IProduct** to match the provided code declaration. If your lecturer specifically requires the other name, ask before renaming it.
