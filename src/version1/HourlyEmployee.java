/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

public class HourlyEmployee {


    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;


    public HourlyEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }


    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName,
                          float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }


    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setEmpID(int empID) {
        if (empID >= 0) {
            this.empID = empID;
        }
    }

    public void setEmpName(String empName) {
        if (empName != null && !empName.trim().isEmpty()) {
            this.empName = empName;
        }
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) {
            this.totalHoursWorked = totalHoursWorked;
        }
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0) {
            this.ratePerHour = ratePerHour;
        }
    }

    public double computeSalary() {

        if (totalHoursWorked <= 40) {
            return totalHoursWorked * ratePerHour;
        }

        double regularPay = 40 * ratePerHour;
        double overtimeHours = totalHoursWorked - 40;
        double overtimePay = overtimeHours * (ratePerHour * 1.5);

        return regularPay + overtimePay;
    }

    public void displayHourlyEmployee() {
        System.out.printf(
                "ID: %d | Name: %s | Hours: %.2f | Rate: ₱%.2f/hr%n",
                empID,
                empName,
                totalHoursWorked,
                ratePerHour
        );
    }

  
    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee [ID: %d, Name: %s, Hours: %.2f, Rate: ₱%.2f, Total Salary: ₱%.2f]",
                empID,
                empName,
                totalHoursWorked,
                ratePerHour,
                computeSalary()
        );
    }
}