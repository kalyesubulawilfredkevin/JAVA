import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your grade (A, B, C, E, F):");
        // char grade = scanner.next().toUpperCase().charAt(0);
        // switch (grade) {
        // case 'A':
        // System.out.println("Excellent");
        // break;
        // case 'B':
        // System.out.println("Very good");
        // break;
        // case 'C':
        // System.out.println("Good");
        // break;
        // case 'D':
        // System.out.println("Pass");
        // break;
        // case 'F':
        // System.out.println("Fail");
        // break;
        // default:
        // System.out.println("invalid grade");
        // }
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int category = age / 5;
        switch (category) {
            case 3://[15-19]
                System.out.println("too young not eligble");
                break;
            case 4: // [20-25]
                System.out.println("Enrty level candidate");
                break;
            case 5: // [25-29]
                System.out.println("Junior professional");
                break;
            case 6: // [30-34]
            case 7: // [35-3]
                System.out.println("Mid level professional");
                break;
            case 8:// [40-44]
            case 9: // [45-49]
                System.out.println("Senior professional");
                break;
            default:
                if (age < 18) {
                    System.out.println("Under age - not allowed to apply");
                } else {
                    System.out.println("Executeve level");
                }
        }
        scanner.close();
    }

}
