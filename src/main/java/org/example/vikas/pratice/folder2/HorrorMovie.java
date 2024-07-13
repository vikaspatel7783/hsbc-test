package org.example.vikas.pratice.folder2;

public class HorrorMovie implements Movie {

    private String name;
    private String ticketPrice;
    private String type;

    public HorrorMovie(String name, String price, String type) {
        this.name = name;
        this.ticketPrice = price;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getTicketPrice() {
        return this.ticketPrice;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
