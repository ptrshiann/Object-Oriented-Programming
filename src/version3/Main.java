/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

public class Main {

    public static void main(String[] args) {

        int targetMonth = 9;

        Employee[] employees = {

                new HourlyEmployee(
                        101,
                        new Name(
                                "Alice",
                                "Marie",
                                "Smith"
                        ),
                        new MyDate(18, 9, 2000),
                        new MyDate(1, 6, 2022),
                        45,
                        200
                ),

                new PieceWorkerEmployee(
                        201,
                        new Name(
                                "Bob",
                                "Charles",
                                "Jones",
                                "Jr."
                        ),
                        new MyDate(5, 4, 1998),
                        new MyDate(15, 1, 2023),
                        250,
                        15
                ),

                new CommissionEmployee(
                        301,
                        new Name(
                                "Charlie",
                                "David",
                                "Brown"
                        ),
                        new MyDate(10, 9, 1995),
                        new MyDate(10, 2, 2021),
                        150000
                ),

                new BasePlusCommissionEmployee(
                        401,
                        new Name(
                                "Diana",
                                "Anne",
                                "Wilson"
                        ),
                        new MyDate(20, 12, 1990),
                        new MyDate(5, 3, 2020),
                        200000,
                        20000
                )
        };



        System.out.println(
                "======================================================================"
        );
        System.out.println(
                "           POLYMORPHIC PAYROLL REPORT (Target Month: Sep)"
        );
        System.out.println(
                "======================================================================"
        );

        for (int i = 0; i < employees.length; i++) {

            Employee emp = employees[i];

            System.out.println();
            System.out.println(
                    (i + 1) + ". " + emp.toString()
            );

            double basePay =
                    emp.computeSalary();

            double totalPayout =
                    emp.computeSalary(targetMonth);

            double birthdayBonus =
                    totalPayout - basePay;

            String eligibility =
                    birthdayBonus > 0
                            ? "Eligible"
                            : "Ineligible";

            System.out.printf(
                    "Base Pay: ₱%.2f | Birthday Bonus: ₱%.2f (%s)%n",
                    basePay,
                    birthdayBonus,
                    eligibility
            );

            System.out.printf(
                    "Total Payout: ₱%.2f%n",
                    totalPayout
            );
        }



        System.out.println();
        System.out.println(
                "======================================================================"
        );
        System.out.println(
                "             OBJECT CONTRACT TESTS (equals & hashCode)"
        );
        System.out.println(
                "======================================================================"
        );

        HourlyEmployee emp1 =
                new HourlyEmployee(
                        501,
                        new Name(
                                "Test",
                                "A",
                                "Employee"
                        ),
                        new MyDate(1, 9, 2000),
                        new MyDate(1, 1, 2020),
                        40,
                        100
                );

        HourlyEmployee emp1Identical =
                new HourlyEmployee(
                        501,
                        new Name(
                                "Test",
                                "A",
                                "Employee"
                        ),
                        new MyDate(1, 9, 2000),
                        new MyDate(1, 1, 2020),
                        40,
                        100
                );

        HourlyEmployee emp2 =
                new HourlyEmployee(
                        502,
                        new Name(
                                "Another",
                                "B",
                                "Employee"
                        ),
                        new MyDate(2, 10, 2001),
                        new MyDate(1, 1, 2020),
                        40,
                        100
                );

        System.out.println(
                "emp1 equals emp1Identical: "
                        + emp1.equals(emp1Identical)
        );

        System.out.println(
                "emp1 hashCode: "
                        + emp1.hashCode()
                        + " | emp1Identical hashCode: "
                        + emp1Identical.hashCode()
                        + " (Match: "
                        + (emp1.hashCode()
                        == emp1Identical.hashCode())
                        + ")"
        );

        System.out.println(
                "emp1 equals emp2: "
                        + emp1.equals(emp2)
        );




        System.out.println();
        System.out.println(
                "======================================================================"
        );
        System.out.println(
                "                    DEEP CLONE VERIFICATION"
        );
        System.out.println(
                "======================================================================"
        );

        HourlyEmployee original =
                (HourlyEmployee) employees[0];

        HourlyEmployee clone =
                original.clone();

        System.out.println(
                "Original Name before modification: "
                        + original.getEmpName()
        );

 
        clone.getEmpName().setFirstName("Taylor");

        System.out.println(
                "Clone Name changed to: "
                        + clone.getEmpName()
        );

        System.out.println(
                "Original Name after modification: "
                        + original.getEmpName()
        );

        if (!original.getEmpName().equals(
                clone.getEmpName())) {

            System.out.println(
                    "Deep copy successful!"
            );

        } else {

            System.out.println(
                    "Deep copy failed."
            );
        }
    }
}