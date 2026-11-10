package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookRoom_should_return_true() {
        // Arrange - Set up all the variables needed for the method
        Hotel hotel = new Hotel("Hilton", 10, 25, 3, 10);
        int roomCount = 2;
        boolean suite = false;

        int expectedBookedRooms = 12;

        // Act - ONE method call for testing
        hotel.bookRoom(roomCount, suite);

        // Assert - Write code to verify the method performed as expected
        assertEquals(expectedBookedRooms, hotel.getBookedBasicRooms());
    }

}