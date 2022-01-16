package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderedStream1656Test {

    @Test
    void insert() {
        OrderedStream1656 os = new OrderedStream1656(5);
        List<String> first = os.insert(3, "ccccc");

        List<String> second = os.insert(1, "aaaaa");
        List<String> third = os.insert(2, "bbbbb");
        List<String> fourth = os.insert(5, "eeeee");
        List<String> fifth = os.insert(4, "ddddd");

        assertEquals(List.of(), first);
        assertEquals(List.of("aaaaa"), second);
        assertEquals(List.of("bbbbb", "ccccc"), third);
        assertEquals(List.of(), fourth);
        assertEquals(List.of("ddddd", "eeeee"), fifth);

    }
}