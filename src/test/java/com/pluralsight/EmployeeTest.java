package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    // THE COMMENTS FOR THESE TESTS ARE FOR ME TO REMEMBER THE FORMAT NOT FOR TYPICAL PROGRAMS I'LL DO

    @Test
    public void punchIn_should_update_punchedIn() {
        // Arrange
        Employee employee = new Employee("001", "Jane Doe", "Hospitality", 20.00, 0);
        boolean expectedPunchedIn = true;

        // Act
        employee.punchIn(8);

        // Assert
        assertEquals(expectedPunchedIn, employee.getPunchedIn());
    }

    @Test
    public void punchOut_should_update_punchedIn() {
        Employee employee = new Employee("001", "Jane Doe", "Hospitality", 20.00, 0);
        boolean expectedPunchedIn = false;

        // Act
        employee.punchOut(10);

        // Assert
        assertEquals(expectedPunchedIn, employee.getPunchedIn());
    }

    @Test
    public void punchOut_should_update_hoursWorked() {
        Employee employee = new Employee("001", "Jane Doe", "Hospitality", 20.00, 20);
        double expectedHoursWorked = 28;

        // Act
        employee.punchIn(2);
        employee.punchOut(10);

        // Assert
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }

    @Test
    public void punchTimeCard_should_updatePunchedIn() {
        Employee employee = new Employee("001", "Jane Doe", "Hospitality", 20.00, 0);
        boolean expectedPunchedIn = true;

        employee.punchTimeCard();

        assertTrue(employee.getPunchedIn());
    }
}