package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(boolean isDirty, boolean isOccupied, double price, int numberOfBeds) {
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !this.isOccupied && !this.isDirty;
    }

    public boolean checkIn() {
        if (!isOccupied() && !isDirty()) {
            this.isOccupied = true;
            this.isDirty = true;

            return true;
        } else {
            return false;
        }
    }

    public boolean checkOut() {
        if (isOccupied()) {
            this.isOccupied = false;

            return true;
        } else {
            return false;
        }
    }

    public boolean cleanRoom() {
        if (!isOccupied() && isDirty()) {
            this.isDirty = false;

            return true;
        } else {
            return false;
        }
    }
}
