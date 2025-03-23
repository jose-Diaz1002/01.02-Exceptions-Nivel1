import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProducts(Product product){
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if(products.size() == 0){
            throw new EmptySaleException();
        }
        totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
        System.out.println("The total sale amount is: " + totalPrice);
    }

    @Override
    public String toString() {
        return  "| products=" + products +
                ", totalPrice=" + totalPrice +
                '|';
    }
}
