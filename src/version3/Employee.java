/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

import java.util.Objects;

public class Employee implements Cloneable {


    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;

    public Employee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
    }

    public Employee(int empID, Name empName,
                    MyDate birthDate, MyDate dateHired) {

        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
    }


    public int getEmpID() {
        return empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }


    public void setEmpID(int empID) {
        if (empID >= 0) {
            this.empID = empID;
        }
    }

    public void setEmpName(Name empName) {
        if (empName != null) {
            this.empName = empName;
        }
    }

    public void setBirthDate(MyDate birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        }
    }

    public void setDateHired(MyDate dateHired) {
        if (dateHired != null) {
            this.dateHired = dateHired;
        }
    }


    public double computeSalary() {
        return computeSalary(-1);
    }

 
    public double computeSalary(int currentMonth) {

        if (birthDate != null
                && birthDate.getMonth() == currentMonth) {
            return 5000.00;
        }

        return 0.00;
    }


    public void displayEmployee() {

        System.out.printf(
                "ID: %d | Name: %s | DOB: %s | Hired: %s%n",
                empID,
                empName,
                birthDate,
                dateHired
        );
    }


    @Override
    public String toString() {

        return String.format(
                "Employee [ID: %d, Name: %s, DOB: %s, Hired: %s]",
                empID,
                empName,
                birthDate,
                dateHired
        );
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;

        return empID == other.empID
                && Objects.equals(empName, other.empName)
                && Objects.equals(birthDate, other.birthDate)
                && Objects.equals(dateHired, other.dateHired);
    }


    @Override
    public int hashCode() {

        return Objects.hash(
                getClass(),
                empID,
                empName,
                birthDate,
                dateHired
        );
    }


    @Override
    public Employee clone() {

        try {

            Employee copy =
                    (Employee) super.clone();

    
            copy.empName =
                    this.empName != null
                            ? this.empName.clone()
                            : null;

            copy.birthDate =
                    this.birthDate != null
                            ? this.birthDate.clone()
                            : null;

            copy.dateHired =
                    this.dateHired != null
                            ? this.dateHired.clone()
                            : null;

            return copy;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
