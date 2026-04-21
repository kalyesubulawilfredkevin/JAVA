class Students {
    String RegNo;
    String Name;
    int JavaMark;
    int MultimediaMark;

    //  void method (displays total)
    void calculateTotal() {
        int total = JavaMark + MultimediaMark;
        System.out.println("Void Total: " + total);
    }

    //  return total marks method
    int returnCalculateTotal() {
        return JavaMark + MultimediaMark;
    }

    //  method with parameters returning total
    int calculateTotal(int javaMark, int multimediaMark) {
        return javaMark + multimediaMark;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Students students1 = new Students();

        // Assign values
        students1.RegNo = "2025-B071-20977";
        students1.Name = "KALYESUBULAWILFREDKEVIN";
        students1.JavaMark = 500;
        students1.MultimediaMark = 200;

        // Display assigned values
        System.out.println("Reg No: " + students1.RegNo);
        System.out.println("Name: " + students1.Name);
        System.out.println("Java Mark: " + students1.JavaMark);
        System.out.println("Multimedia Mark: " + students1.MultimediaMark);

        // Call void method
        students1.calculateTotal();

        // Call return method
        System.out.println("Return Total: " + students1.returnCalculateTotal());

        // Call parameterized method
        int total = students1.calculateTotal(students1.JavaMark, students1.MultimediaMark);
        System.out.println("Parameter Total : " + total);
    }
}