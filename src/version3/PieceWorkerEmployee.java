/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

import java.util.Objects;

public class PieceWorkerEmployee extends Employee {

    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID,
                               Name empName,
                               MyDate birthDate,
                               MyDate dateHired,
                               int totalPiecesFinished,
                               double ratePerPiece) {

        super(empID, empName, birthDate, dateHired);

        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }


    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }


    public void setTotalPiecesFinished(int totalPiecesFinished) {
        if (totalPiecesFinished >= 0) {
            this.totalPiecesFinished = totalPiecesFinished;
        }
    }

    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece >= 0) {
            this.ratePerPiece = ratePerPiece;
        }
    }

 
    private double computeBaseSalary() {

        double basePay =
                totalPiecesFinished * ratePerPiece;

        int completedHundreds =
                totalPiecesFinished / 100;

        double bonusPay =
                completedHundreds
                        * 10
                        * ratePerPiece;

        return basePay + bonusPay;
    }

    @Override
    public double computeSalary() {
        return computeBaseSalary();
    }


    @Override
    public double computeSalary(int currentMonth) {

        return computeBaseSalary()
                + super.computeSalary(currentMonth);
    }

 
    public void displayPieceWorkerEmployee() {

        System.out.printf(
                "ID: %d | Name: %s | DOB: %s | Hired: %s | Pieces: %d | Rate/Piece: ₱%.2f%n",
                getEmpID(),
                getEmpName(),
                getBirthDate(),
                getDateHired(),
                totalPiecesFinished,
                ratePerPiece
        );
    }


    @Override
    public String toString() {

        return String.format(
                "PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: ₱%.2f, Total Salary: ₱%.2f]",
                getEmpID(),
                getEmpName(),
                getBirthDate(),
                getDateHired(),
                totalPiecesFinished,
                ratePerPiece,
                computeSalary()
        );
    }


    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        PieceWorkerEmployee other =
                (PieceWorkerEmployee) obj;

        return totalPiecesFinished ==
                other.totalPiecesFinished
                && Double.compare(
                    ratePerPiece,
                    other.ratePerPiece
                ) == 0;
    }

  
    @Override
    public int hashCode() {

        return Objects.hash(
                super.hashCode(),
                totalPiecesFinished,
                ratePerPiece
        );
    }


    @Override
    public PieceWorkerEmployee clone() {
        return (PieceWorkerEmployee) super.clone();
    }
}