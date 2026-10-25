/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package version1;

public class Main {

    public static void main(String[] args) {


        System.out.println("==============================================");
        System.out.println("        HOURLY EMPLOYEE TEST");
        System.out.println("==============================================");


        HourlyEmployee hourly1 =
                new HourlyEmployee(101, "Alice Smith");

        hourly1.setTotalHoursWorked(45);
        hourly1.setRatePerHour(200);


        HourlyEmployee hourly2 =
                new HourlyEmployee(102, "John Doe", 38, 250);

        System.out.println("[displayHourlyEmployee()]");
        hourly1.displayHourlyEmployee();
        hourly2.displayHourlyEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(hourly1);
        System.out.println(hourly2);



        System.out.println();
        System.out.println("==============================================");
        System.out.println("       PIECE WORKER EMPLOYEE TEST");
        System.out.println("==============================================");


        PieceWorkerEmployee piece1 =
                new PieceWorkerEmployee(201, "Bob Jones");

        piece1.setTotalPiecesFinished(250);
        piece1.setRatePerPiece(15);


        PieceWorkerEmployee piece2 =
                new PieceWorkerEmployee(202, "Charlie Brown", 180, 20);

        System.out.println("[displayPieceWorkerEmployee()]");
        piece1.displayPieceWorkerEmployee();
        piece2.displayPieceWorkerEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(piece1);
        System.out.println(piece2);


       
        System.out.println();
        System.out.println("==============================================");
        System.out.println("       COMMISSION EMPLOYEE TEST");
        System.out.println("==============================================");

     
        CommissionEmployee commission1 =
                new CommissionEmployee(301, "David Lee");

        commission1.setTotalSale(75000);

     
        CommissionEmployee commission2 =
                new CommissionEmployee(302, "Emma Watson", 150000);

        System.out.println("[displayCommissionEmployee()]");
        commission1.displayCommissionEmployee();
        commission2.displayCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(commission1);
        System.out.println(commission2);


       
        System.out.println();
        System.out.println("==============================================");
        System.out.println("   BASE PLUS COMMISSION EMPLOYEE TEST");
        System.out.println("==============================================");

  
        BasePlusCommissionEmployee basePlus1 =
                new BasePlusCommissionEmployee(401, "Frank Miller");

        basePlus1.setTotalSale(60000);
        basePlus1.setBaseSalary(12000);

        BasePlusCommissionEmployee basePlus2 =
                new BasePlusCommissionEmployee(
                        402,
                        "Grace Wilson",
                        550000,
                        20000
                );

        System.out.println("[displayBasePlusCommissionEmployee()]");
        basePlus1.displayBasePlusCommissionEmployee();
        basePlus2.displayBasePlusCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(basePlus1);
        System.out.println(basePlus2);
    }
}