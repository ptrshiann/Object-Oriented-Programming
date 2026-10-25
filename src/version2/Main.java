/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package version2;

public class Main {

    public static void main(String[] args) {

        int birthMonth = 9;
        int regularMonth = 10;


        System.out.println("==============================================");
        System.out.println("      NAME & DATE OUTPUT VERIFICATION");
        System.out.println("==============================================");

        Name name = new Name(
                "Alice",
                "Marie",
                "Smith"
        );

        MyDate date = new MyDate(
                18,
                9,
                2026
        );

        name.displayName();
        date.displayDate();


        System.out.println();
        System.out.println("==============================================");
        System.out.println("       HOURLY EMPLOYEE PAYROLL TEST");
        System.out.println("==============================================");


        HourlyEmployee hourly1 =
                new HourlyEmployee(
                        101,
                        new Name("Alice", "Marie", "Smith"),
                        new MyDate(18, 9, 2000),
                        new MyDate(1, 6, 2022)
                );

        hourly1.setTotalHoursWorked(45);
        hourly1.setRatePerHour(200);

    
        HourlyEmployee hourly2 =
                new HourlyEmployee(
                        102,
                        new Name("John", "Paul", "Doe"),
                        new MyDate(10, 3, 1999),
                        new MyDate(15, 8, 2023),
                        38,
                        250
                );

        System.out.println("[displayHourlyEmployee()]");
        hourly1.displayHourlyEmployee();
        hourly2.displayHourlyEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(hourly1);
        System.out.println(hourly2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.printf(
                "Regular Month (Oct) Salary: ₱%.2f%n",
                hourly1.computeSalary(regularMonth)
        );
        System.out.printf(
                "Birth Month (Sep) Salary (+₱5,000.00): ₱%.2f%n",
                hourly1.computeSalary(birthMonth)
        );


        System.out.println();
        System.out.println("==============================================");
        System.out.println("       PIECE WORKER PAYROLL TEST");
        System.out.println("==============================================");

        PieceWorkerEmployee piece1 =
                new PieceWorkerEmployee(
                        201,
                        new Name("Bob", "Charles", "Jones", "Jr."),
                        new MyDate(5, 4, 1998),
                        new MyDate(15, 1, 2023)
                );

        piece1.setTotalPiecesFinished(250);
        piece1.setRatePerPiece(15);

        PieceWorkerEmployee piece2 =
                new PieceWorkerEmployee(
                        202,
                        new Name("Charlie", "David", "Brown"),
                        new MyDate(20, 9, 1997),
                        new MyDate(20, 2, 2024),
                        320,
                        18
                );

        System.out.println("[displayPieceWorkerEmployee()]");
        piece1.displayPieceWorkerEmployee();
        piece2.displayPieceWorkerEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(piece1);
        System.out.println(piece2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.printf(
                "Regular Month Salary: ₱%.2f%n",
                piece1.computeSalary(regularMonth)
        );
        System.out.printf(
                "Birth Month Salary: ₱%.2f%n",
                piece1.computeSalary(4)
        );


       
        System.out.println();
        System.out.println("==============================================");
        System.out.println("       COMMISSION EMPLOYEE PAYROLL TEST");
        System.out.println("==============================================");

        CommissionEmployee commission1 =
                new CommissionEmployee(
                        301,
                        new Name("David", "Edward", "Lee"),
                        new MyDate(12, 9, 1995),
                        new MyDate(1, 7, 2021)
                );

        commission1.setTotalSale(75000);

        CommissionEmployee commission2 =
                new CommissionEmployee(
                        302,
                        new Name("Emma", "Rose", "Watson"),
                        new MyDate(25, 11, 1996),
                        new MyDate(10, 10, 2022),
                        150000
                );

        System.out.println("[displayCommissionEmployee()]");
        commission1.displayCommissionEmployee();
        commission2.displayCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(commission1);
        System.out.println(commission2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.printf(
                "Regular Month Salary: ₱%.2f%n",
                commission1.computeSalary(regularMonth)
        );
        System.out.printf(
                "Birth Month Salary: ₱%.2f%n",
                commission1.computeSalary(9)
        );


        System.out.println();
        System.out.println("==============================================");
        System.out.println("    BASE PLUS COMMISSION PAYROLL TEST");
        System.out.println("==============================================");

        BasePlusCommissionEmployee base1 =
                new BasePlusCommissionEmployee(
                        401,
                        new Name("Frank", "Michael", "Miller"),
                        new MyDate(8, 9, 1990),
                        new MyDate(2, 5, 2020)
                );

        base1.setTotalSale(60000);
        base1.setBaseSalary(12000);

        BasePlusCommissionEmployee base2 =
                new BasePlusCommissionEmployee(
                        402,
                        new Name("Grace", "Anne", "Wilson"),
                        new MyDate(10, 12, 1991),
                        new MyDate(5, 3, 2021),
                        550000,
                        20000
                );

        System.out.println("[displayBasePlusCommissionEmployee()]");
        base1.displayBasePlusCommissionEmployee();
        base2.displayBasePlusCommissionEmployee();

        System.out.println();
        System.out.println("[toString()]");
        System.out.println(base1);
        System.out.println(base2);

        System.out.println();
        System.out.println("[Birthday Incentive Check]");
        System.out.printf(
                "Regular Month Salary: ₱%.2f%n",
                base1.computeSalary(regularMonth)
        );
        System.out.printf(
                "Birth Month Salary: ₱%.2f%n",
                base1.computeSalary(9)
        );
    }
}