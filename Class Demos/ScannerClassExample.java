import java.util.Scanner;

public class ScannerClassExample {
  public static void main(String args[]){
         System.out.println("--------Enter Your Details-------- ");
         Scanner in = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = in.next();
         System.out.print("Enter your age: ");
         int i = in.nextInt();
         System.out.print("Are you married (Please enter 'Y' or  'N')");      
         char ch=in.next().charAt(0);
         System.out.print("Enter your salary: ");
         double d = in.nextDouble();
         System.out.println();
         System.out.println("--------Your Details-------- ");
System.out.println("Name: " + name);
System.out.println("Age: " + i);
System.out.println("Married: " + ch);
System.out.println("Salary: " + d);
}
}
