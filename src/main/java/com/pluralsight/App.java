package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Reservation reservation = new Reservation("king", 139.00, 3, true);

        System.out.printf("Total: $%.2f", reservation.getReservationTotal());
        System.out.println();

        Employee employee1 = new Employee("0001", "Barbara Jones", "Housekeeping", 20.00, 20);
        Employee employee2 = new Employee("0002", "Clancy Carter", "Room Service", 20.00, 45);

        System.out.printf("Total Pay for %s: $%.2f%n", employee1.getName(), employee1.getTotalPay());
        System.out.printf("Total Pay for %s: $%.2f%n", employee2.getName(), employee2.getTotalPay());

    }
}
