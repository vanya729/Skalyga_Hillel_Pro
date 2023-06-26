package lessons15;


import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private String type;
    private double price;
    private boolean sale;
    private LocalDate localDate;

    public Product(String type, double price, boolean sale, LocalDate localDate) {
        this.type = type;
        this.price = price;
        this.sale = sale;
        this.localDate = localDate;
    }

    public Product(String type, double price, boolean sale) {
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", localDate=" + localDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && sale == product.sale && Objects.equals(type, product.type) && Objects.equals(localDate, product.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, sale, localDate);
    }
}