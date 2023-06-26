package lessons15;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamVoid {


    public List<Product> listBookPriceOver250(List<Product> newList){
        return newList.stream()
                .filter(s-> s.getType().equals("Book") && s.getPrice()>250)
                .collect(Collectors.toList());
    }

    public List<Product> boolSale10Percent(List<Product> newList){
        List<Product>productsBySale= newList.stream()
                .filter(product -> product.getType().equals("Book")&&product.isSale())
                .map(product ->{
                        double discountPrice = product.getPrice() * 0.9;
                        product.setPrice(discountPrice);
                        return product; })
                .collect(Collectors.toList());
        return productsBySale;
    }

    public Product cheapestProduct(List<Product> newList){
        Optional<Product> minPrice = newList.stream()
                .filter(product -> product.getType().equals("Book"))
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        return minPrice.orElseThrow(()-> new RuntimeException("Product:"+ Product.class.getTypeName()+ "dont found"));
    }

    public List<Product> lastProductByDay(List<Product> newList){
        return newList.stream()
                .sorted(Comparator.comparing(Product::getLocalDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double totalPrice(List<Product> newList) {
        int currentYear = LocalDate.now().getYear();
        double totalSum = newList.stream()
                .filter(product -> product.getLocalDate().getYear() == currentYear &&
                        product.getType().equals("Book") && product.getPrice() <= 150)
                .mapToDouble(Product::getPrice)
                .sum();
        return totalSum;
    }


    public Map<String , List<Product>> groupOfProduct(List<Product> newList){
        int currentYear = LocalDate.now().getYear();
        Map<String , List<Product>> result = newList.stream()
                .filter(product -> product.getLocalDate().getYear() == currentYear &&
                        product.getType().equals("Book") && product.getPrice()<=200)
                .collect(Collectors.groupingBy(Product::getType));
        return result;
    }
}
