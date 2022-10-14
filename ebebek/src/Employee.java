import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public double tax(){
        double taxPayment=0;
        if (this.salary > 1000){
            taxPayment = (this.salary / 100) * 3;
        }
        return taxPayment;
    }

    public int bonus(){
        int employeeBonus = 0;
        if (this.workHours > 40){
            employeeBonus = (this.workHours - 40) * 30;
        }
        return employeeBonus;
    }
    public double raiseSalary(){
        double employeeRaise;
        int totalYear = (2021 - this.hireYear);
        double calcSalary = this.salary - this.tax() + this.bonus();
        if (totalYear > 19 ){
            employeeRaise = (calcSalary / 100) * 15;
        } else if (totalYear > 9 && totalYear < 20 ) {
            employeeRaise = (calcSalary / 100) * 10;
        }else if (totalYear < 10 && totalYear >= 1){
            employeeRaise = (calcSalary / 100) * 5;
        }else{
            employeeRaise = 0;
        }
        return employeeRaise;
    }

    @Override
    public String toString(){
        return "Calisanin adi :" + this.name +
                "\nIse baslama tarihi :" + this.hireYear +
                "\nSirkette toplam calistigi yil :" + (2021 - this.hireYear) +
                "\nHaftalik Calistigi Sure :" + this.hireYear +
                "\nCalisanin haftalik net maasi :" + (this.salary - this.tax() + this.raiseSalary() + this.bonus()) +
                "\nVergiler dahil haftalik toplam maas :" +(this.salary + this.raiseSalary() + this.bonus());
    }
}
