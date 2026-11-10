package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_set_occupied_and_dirty() {
        // Arrange
        Room room = new Room(false, false, 139.00, 1);
        boolean expectedOccupied = true;
        boolean expectedDirty = true;

        // Act
        room.checkIn();

        // Assert
        assertEquals(expectedOccupied, room.isOccupied());
        assertEquals(expectedDirty, room.isDirty());
    }

    @Test
    public void checkOut_should_set_not_occupied() {
        // Arrange
        Room room = new Room(true, true, 139.00, 1);
        boolean expectedOccupied = false;
        boolean expectedDirty = true;

        // Act
        room.checkOut();

        // Assert
        assertEquals(expectedOccupied, room.isOccupied());
        assertEquals(expectedDirty, room.isDirty());
    }

    @Test
    public void cleanRoom_should_set_not_dirty() {
        // Arrange
        Room room = new Room(true, false, 139.00, 1);
        boolean expectedOccupied = false;
        boolean expectedDirty = false;

        // Act
        room.cleanRoom();

        // Assert
        assertEquals(expectedOccupied, room.isOccupied());
        assertEquals(expectedDirty, room.isDirty());
    }

    @Test
    public void checkIn_should_not_work_for_occupied_room() {
        Room room = new Room(true, true, 139.00, 1);
        boolean expected = false;

        // Act
        room.checkIn();

        // Assert
        assertEquals(expected, room.checkIn());
    }

    @Test
    public void checkIn_should_not_work_for_dirty_room() {
        Room room = new Room(true, true, 139.00, 1);
        boolean expected = false;

        // Act
        room.checkIn();

        // Assert
        assertEquals(expected, room.checkIn());
    }

    @Test
    public void cleanRoom_should_not_work_for_occupied_room() {
        Room room = new Room(true, true, 139.00, 1);
        boolean expected = false;

        // Act
        room.cleanRoom();

        // Assert
        assertEquals(expected, room.cleanRoom());
    }

}