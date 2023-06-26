package lessons15;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

public class TestVoidMain {

        StreamVoid streamVoid = new StreamVoid();

        @Test
        @DisplayName("Book price over 250, solution correctness test ")
        public void listBookPriceOver250Test1() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 200));
            productList.add(new Product("Book", 300));
            productList.add(new Product("Toy", 150));
            productList.add(new Product("Book", 400));
            productList.add(new Product("Book", 100));

            List<Product> res = streamVoid.listBookPriceOver250(productList);

            List<Product> expected = new ArrayList<>();
            expected.add(new Product("Book", 300));
            expected.add(new Product("Book", 400));
            assertEquals(expected, res);
        }

        @Test
        @DisplayName("Book price over 250, test for empty List")
        public void listBookPriceOver250Test2() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 200));
            productList.add(new Product("Book", 250));
            productList.add(new Product("Toy", 150));
            productList.add(new Product("Book", 220));
            productList.add(new Product("Book", 180));

            List<Product> result = streamVoid.listBookPriceOver250(productList);

            List<Product> expected = new ArrayList<>();

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("boolSale10Percent, solution correctness test ")
        public void boolSale10PercentTest1() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100, true));
            productList.add(new Product("Book", 200, false));
            productList.add(new Product("Toy", 150, true));
            productList.add(new Product("Book", 300, true));
            productList.add(new Product("Book", 80, false));

            List<Product> result = streamVoid.boolSale10Percent(productList);

            List<Product> expected = new ArrayList<>();
            expected.add(new Product("Book", 90, true));
            expected.add(new Product("Book", 270, true));

            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Cheapest product")
        public void cheapestProductTest1() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100));
            productList.add(new Product("Book", 200));
            productList.add(new Product("Toy", 150));
            productList.add(new Product("Book", 300));
            productList.add(new Product("Book", 80));

            Product result = streamVoid.cheapestProduct(productList);

            Product expected = new Product("Book", 80);
            assertEquals(expected, result);

        }

        @Test
        @DisplayName("Cheapest product")
        public void cheapestProductTest2() {
            List<Product> productList = new ArrayList<>();
            assertThrows(RuntimeException.class, () -> streamVoid.cheapestProduct(productList));
        }

        @Test
        @DisplayName("Last product by day")
        public void lastProductByDay(){
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100, false, LocalDate.of(2023, 6, 1)));
            productList.add(new Product("Book", 200, true, LocalDate.of(2023, 6, 3)));
            productList.add(new Product("Toy", 150, true, LocalDate.of(2023, 6, 2)));
            productList.add(new Product("Book", 300, false, LocalDate.of(2023, 6, 5)));
            productList.add(new Product("Book", 80, true, LocalDate.of(2023, 6, 4)));

            List<Product> result = streamVoid.lastProductByDay(productList);

            List<Product> expected = new ArrayList<>();
            expected.add(new Product("Book", 300, false, LocalDate.of(2023, 6, 5)));
            expected.add(new Product("Book", 80, true, LocalDate.of(2023, 6, 4)));
            expected.add(new Product("Book", 200, true, LocalDate.of(2023, 6, 3)));

            assertEquals(expected, result);
        }
        @Test
        @DisplayName("Last product by day with two parameter")
        public void lastProductByDayTest_FewerThan3Products() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100, false, LocalDate.of(2023, 6, 1)));
            productList.add(new Product("Toy", 150, true, LocalDate.of(2023, 6, 2)));

            List<Product> result = streamVoid.lastProductByDay(productList);

            List<Product> expected = new ArrayList<>();
            expected.add(new Product("Toy", 150, true, LocalDate.of(2023, 6, 2)));
            expected.add(new Product("Book", 100, false, LocalDate.of(2023, 6, 1)));

            assertEquals(expected, result);
        }


        @Test
        @DisplayName("Total price with empty list")
        public void totalPriceEmptyList() {
            List<Product> productList = new ArrayList<>();
            double result = streamVoid.totalPrice(productList);
            assertEquals(0, result, 0.01);
        }

        @Test
        @DisplayName("Total price with full list")
        public void totalPriceTest() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100, false, LocalDate.of(2023, 6, 1)));
            productList.add(new Product("Book", 200, true, LocalDate.of(2023, 6, 3)));
            productList.add(new Product("Toy", 150, true, LocalDate.of(2023, 6, 2)));
            productList.add(new Product("Book", 300, false, LocalDate.of(2023, 6, 5)));
            productList.add(new Product("Book", 80, true, LocalDate.of(2023, 6, 4)));

            double result = streamVoid.totalPrice(productList);

            assertEquals(180, result, 0.01);
        }

        @Test
        @DisplayName("Type -book, 2023 years, price<=450")
        public void groupOfProductTest1() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Book", 100, false, LocalDate.of(2023, 6, 1)));
            productList.add(new Product("Toy", 150, true, LocalDate.of(2023, 6, 2)));
            productList.add(new Product("Book", 200, true, LocalDate.of(2023, 6, 3)));
            productList.add(new Product("Book", 300, false, LocalDate.of(2023, 6, 4)));
            productList.add(new Product("Book", 400, true, LocalDate.of(2023, 6, 5)));

            Map<String, List<Product>> result = streamVoid.groupOfProduct(productList);

            Map<String, List<Product>> expected = new HashMap<>();
            expected.put("Book", Arrays.asList(
                    new Product("Book", 100, false, LocalDate.of(2023, 6, 1)),
                    new Product("Book", 200, true, LocalDate.of(2023, 6, 3))
            ));
            assertEquals(expected, result);
        }

}

