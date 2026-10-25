/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

public class CommissionEmployee {


    private int empID;
    private String empName;
    private double totalSale;


    public CommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
    }


    public CommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
    }

 
    public CommissionEmployee(int empID, String empName, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        setTotalSale(totalSale);
    }


    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getTotalSale() {
        return totalSale;
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

    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) {
            this.totalSale = totalSale;
        }
    }

   
    private double getCommissionRate() {

        if (totalSale < 50000) {
            return 0.05;
        } else if (totalSale < 100000) {
            return 0.10;
        } else if (totalSale < 500000) {
            return 0.15;
        } else {
            return 0.20;
        }
    }

   
    public double computeSalary() {
        return totalSale * getCommissionRate();
    }

  
    public void displayCommissionEmployee() {
        System.out.printf(
                "ID: %d | Name: %s | Total Sale: ₱%.2f%n",
                empID,
                empName,
                totalSale
        );
    }

   
    @Override
    public String toString() {
        return String.format(
                "CommissionEmployee [ID: %d, Name: %s, Total Sale: ₱%.2f, Commission Rate: %.0f%%, Total Salary: ₱%.2f]",
                empID,
                empName,
                totalSale,
                getCommissionRate() * 100,
                computeSalary()
        );
    }
}