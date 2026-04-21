public class Student {
    private String firstName;
    private String lastName;
    private double semesterFee;

    // Constructor
    public Student(String firstName, String lastName, double semesterFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSemesterFee(semesterFee); // use setter to enforce validation
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSemesterFee(double semesterFee) {
        this.semesterFee = (semesterFee > 0) ? semesterFee : 0.0;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    // Returns yearly fee (semesterFee * 2)
    public double getYearlyFee() {
        return semesterFee * 2;
    }

    // Applies a 10% raise to the semester fee
    public void applyRaise(double percentage) {
        semesterFee += semesterFee * (percentage / 100);
    }
}
