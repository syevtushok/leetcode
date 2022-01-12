package medium;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Codec535Test {

    private static final String GOOGLE_COM = "http://www.google.com";
    private final Codec535 codec535 = new Codec535();

    @Test
    @Order(1)
    void encode() {
        String actual = codec535.encode(GOOGLE_COM);
        String expected = String.valueOf(0);
        assertEquals(expected, actual);
    }

    @Test
    @Order(2)
    void decode() {
        String encode = codec535.encode(GOOGLE_COM);
        System.out.println(encode);
        String actual = codec535.decode(String.valueOf(0));
        assertEquals(GOOGLE_COM, actual);

    }
}