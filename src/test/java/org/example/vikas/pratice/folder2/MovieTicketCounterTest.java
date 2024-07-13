package org.example.vikas.pratice.folder2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MovieTicketCounterTest {

    @Test
    public void getMovie() {
        MovieTicketCounter counter = new MovieTicketCounter();
        Movie actionMovie = counter.getMovie("Action");
        assertEquals("Action", actionMovie.getType());
        assertNotEquals("Horror", actionMovie.getType());
    }
}