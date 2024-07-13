package org.example.employee.product;

public class VanillaProduct extends EquityProduct{

    private int strikePrice;
    private String expiry;

    public VanillaProduct(int strikePrice, String expiry) {
        this.strikePrice = strikePrice;
        this.expiry = expiry;
    }

    public int getStrikePrice() {
        return strikePrice;
    }
}
