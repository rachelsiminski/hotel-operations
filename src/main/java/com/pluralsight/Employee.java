package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean punchedIn;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if (this.hoursWorked < 40) {
            return this.hoursWorked;
        }
        else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        else {
            return 0;
        }
    }

    public double getTotalPay() {
        return (getRegularHours() * this.payRate) + (getOvertimeHours() * (payRate * 1.5));
    }

    public void punchIn(int time) {
        startTime = time;
        punchedIn = true;
    }

    public void punchOut(int time) {
        hoursWorked = calculateTime(startTime, time);
        punchedIn = false;
    }

    public double calculateTime(double timeIn, double timeOut) {
        return timeOut - timeIn;
    }
}
