import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Student 1
        System.out.println("=== Enter details for Student 1 ===");
        System.out.print("First Name: ");
        String firstName1 = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName1 = scanner.nextLine();

        System.out.print("Semester Fee: ");
        double semesterFee1 = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        //  Student 2
        System.out.println("\nEnter details for Student 2 ");
        System.out.print("First Name: ");
        String firstName2 = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName2 = scanner.nextLine();

        System.out.print("Semester Fee: ");
        double semesterFee2 = scanner.nextDouble();

        // Create Student objects
        Student student1 = new Student(firstName1, lastName1, semesterFee1);
        Student student2 = new Student(firstName2, lastName2, semesterFee2);

        // Display initial yearly fees
        System.out.println("\nInitial Yearly Fees ");
        System.out.printf("%-20s %-20s %s%n", "First Name", "Last Name", "Yearly Fee");
        System.out.println("-".repeat(55));
        System.out.printf("%-20s %-20s $%.2f%n",
                student1.getFirstName(), student1.getLastName(), student1.getYearlyFee());
        System.out.printf("%-20s %-20s $%.2f%n",
                student2.getFirstName(), student2.getLastName(), student2.getYearlyFee());

        //  Apply 10% raise
        student1.applyRaise(10);
        student2.applyRaise(10);

        //  Display updated yearly fees
        System.out.println("\n Yearly Fees After 10% Raise ");
        System.out.printf("%-20s %-20s %s%n", "First Name", "Last Name", "Yearly Fee");
        System.out.println("-".repeat(55));
        System.out.printf("%-20s %-20s $%.2f%n",
                student1.getFirstName(), student1.getLastName(), student1.getYearlyFee());
        System.out.printf("%-20s %-20s $%.2f%n",
                student2.getFirstName(), student2.getLastName(), student2.getYearlyFee());

        scanner.close();
    }
}
