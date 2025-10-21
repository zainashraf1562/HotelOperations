package com.pluralsight;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }


    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn(double time){
        this.startTime = time;
    }

    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        double hour = now.getHour();
        double minute = now.getMinute();
        double time = hour + (minute/60);
        this.startTime = time;
    }

    public void punchOut(double time) {
        hoursWorked = time - this.startTime;
        this.startTime = 0;
    }

    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double hour = now.getHour();
        double minute = now.getMinute();
        double time = hour + (minute/60);
        hoursWorked = time - this.startTime;
        this.startTime = 0;
    }

    public void punchTimeCard(double time) {
        if (this.startTime == 0) {
            this.startTime = time;
        } else {
            this.hoursWorked = time - this.startTime;
            startTime = 0;
        }
    }
}

