package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double payIncrease) {
        if(payIncrease > 0) {
            this.salary += payIncrease;
        }
    }

    public double payBonus() {
        return 0.01 * this.salary;
    }

    public void setName(String newName) {
        if (newName.length() > 0) {
            this.name = newName;
        }
    }

}
