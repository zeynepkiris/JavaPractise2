package SalaryCal;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax () {;
        if (salary > 1000) {
            return salary * 0.3;
        } else {
            return 0;
        }
    }
    int bonus (){
        if (workHours>40){
            return (40-workHours)*30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (hireYear<=0 || hireYear>2021){
            System.out.println("Input is not valid!!");
        }else {
            int experience = 2021 - hireYear;
            if(experience < 5) return salary * 0.05;
            if(experience > 9 && experience < 20) return salary * 0.10;
            if(experience > 19) return salary * 0.15;
        }
        return 0;
    }


    public String toString() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        double total       = salary - tax() + bonus();
        return  "Name : " + name + '\n' +
                "Salary : " + salary + '\n' +
                "Work Hours : " + workHours + '\n' +
                "Hire Year : " + hireYear + '\n' +
                "Tax : " + tax() + '\n' +
                "Bonus : " + bonus() + '\n' +
                "Raise Salary : " + raiseSalary() + '\n' +
                "Salary with bonus and tax: " + total + '\n' +
                "Total Salary : " + totalSalary;
    }

}
