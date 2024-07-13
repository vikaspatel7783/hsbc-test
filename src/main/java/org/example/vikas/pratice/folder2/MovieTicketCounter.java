package org.example.vikas.pratice.folder2;

public class MovieTicketCounter {

    public Movie getMovie(String movieType) {
        switch (movieType) {
            case "Action": return new ActionMovie("ActionMovie", "200", "Action");
            case "Horror": return new HorrorMovie("HorrorMovie", "150", "Horror");
            default: throw new IllegalArgumentException("Movie not found with type: "+movieType);
        }
    }
}
