import java.util.Scanner;

public class Conditionoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int category = age / 5;

        System.out.println("\n details");
        System.out.println();
        System.out.println("Name:kalyesubula wilfred kevin");
        System.out.println("reg: 2025-B071-20977");
        System.out.println();
        // category for conditional operator
        // <18 : under age
        // 15< && <= 19: too young
        //20 > && <= 25: entry level
        // 25> && <= 29 : junior level professional
        // 30> && <= 39 mid level
        // 40> && <= 49 :senior level
        // >49 && <65 : excecutive
        // 65>= : retirement
        String result =
                // [15,19]
                (category == 3) ? "Too young - not eligible" :
                // [20,25]
                        (category == 4) ? "Entry level candidate" :
                        // [25,29]
                                (category == 5) ? "Junior professional" :
                                // [30,34,35,39]
                                        (category == 6 || category == 7) ? "Mid level professional" :
                                        // [40,44,45,49]
                                                (category == 8 || category == 9) ? "Senior level professional"
                                                        : (age < 18) ? "Underage - not allowed to apply"
                                                                : "Retirement";
        System.out.println(result);
        scanner.close();
    }

}
