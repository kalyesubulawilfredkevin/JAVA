import java.util.Scanner;

public class SwitchToIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        // <18 : to young
        // 18<&& <= 25: enrty level candidate
        // 25> && <= 29 : junior level professional
        // 29> && <= 39 mid level
        // 39> && <= 49 :senior level
        // >49 && <65 : excecutive 
        //65>= : retirement

        if (age < 18){
            System.out.println("Too young");
        }else if (age > 18 && age <= 25){
            System.out.println("Entry level candiadate");
        }else if(age > 25 && age <= 29){
            System.out.println("Junior level candiadate");
        }else if(age > 29 && age <= 39){
            System.out.println("mid level candidate");
        }else if(age >39 && age <= 49){
            System.out.println("senior level candidate");
        }else if(age > 49 && age <= 65){
            System.out.println("executive candidate");
        }else{
            System.out.println("Retirment");
        }
        // int category = age / 5;

        // switch (category) {
        // case 3: // [15, 19]
        // System.out.println("Too young - not eligible");
        // break;
        // case 4: // [20, 25]
        // System.out.println("Entry level candidate");
        // break;
        // case 5: // [25, 29]
        // System.out.println("Junior professional");
        // break;
        // case 6 : // [30, 34]
        // case 7 : // [35, 39]
        // System.out.println("Mid-level professional");
        // break;
        // case 8: // [40, 44]
        // case 9: // [45, 49]
        // System.out.println("Senior-level professional");
        // break;
        // default:
        // if (age < 18) {
        // System.out.println("Underage - not allowed to apply");
        // } else {
        // System.out.println("Executive or Specialist level");
        // }
        // }

        scanner.close();

    }
}
