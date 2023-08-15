package OOP.EmployeeSalary;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            System.out.println("No tax will be applied...");
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            double bonusFee = (this.workHours - 40) * 30;
            return bonusFee;
        } else {
            System.out.println("No bonus fee has been earned...");
            return 0;
        }
    }

    double raiseSalary() {
        double increasedSalary = 0;
        if ((2021 - this.hireYear) < 10) {
            increasedSalary += (this.salary * 5) / 100;
        }
        if (((2021 - this.hireYear) > 9) && ((2021 - this.hireYear) < 20)) {
            increasedSalary += (this.salary * 10) / 100;
        }
        if ((2021 - this.hireYear) > 19) {
            increasedSalary += (this.salary * 15) / 100;
        }
        return increasedSalary;
    }

    void printEmployeeInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work hours: " + this.workHours);
        System.out.println("Year of hire: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary increase: " + raiseSalary());
        System.out.println("Salary with taxes and bonus: " + (this.salary + bonus() - tax()));
        System.out.println("Total Salary: " + (this.salary + raiseSalary()));
    }
}
