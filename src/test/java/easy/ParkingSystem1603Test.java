package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ParkingSystem1603Test {

    @Test
    void addCar() {
        ParkingSystem1603 parkingSystem = new ParkingSystem1603(1, 1, 0);
        boolean first = parkingSystem.addCar(1);
        boolean second = parkingSystem.addCar(2);
        boolean third = parkingSystem.addCar(3);
        boolean fourth = parkingSystem.addCar(1);

        boolean[] expected = { true, true, false, false };
        assertArrayEquals(expected, new boolean[]{ first, second, third, fourth });
    }
}