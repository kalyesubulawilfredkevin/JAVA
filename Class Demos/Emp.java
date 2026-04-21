//getters and setters
public class Emp {
    private int age;
    private String name;
    private double salary;
    public Emp(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name != null&&name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public void main (String[] args) {
        Emp emp1 = new Emp(1,"James",20000);
        System.out.println("Name: "+emp1.getName());
        System.out.println("Salary: "+emp1.getSalary());


    }
}
