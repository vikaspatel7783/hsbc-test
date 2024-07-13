package org.example.employee.product;

public class PriceEngine {

    public ProductPrice getPrice(BaseProduct product) {
        if (product instanceof  VanillaProduct) {
            return new ProductPrice(((VanillaProduct)product).getStrikePrice() * 3);
        } else if (product instanceof  EquityProduct) {
            return new ProductPrice(100);
        } else if (product instanceof BaseProduct) {
            return new ProductPrice(0);
        }
        return null;
    }

}
