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

        // Act - ONE method call for testing
        hotel.bookRoom(roomCount, suite);

        // Assert - Write code to verify the method performed as expected
        System.out.println("Available rooms (Expected 13): " + hotel.getAvailableRooms());
        System.out.println("Available suites (Expected 7): " + hotel.getAvailableSuites());
        System.out.println("Booked rooms (Expected 12): " + hotel.getBookedBasicRooms());
        System.out.println("Booked suites (Expected 3): " + hotel.getBookedSuites());
    }

}