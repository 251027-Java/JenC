import java.util.Scanner;

public class LetterGrade {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double grade;
        try {
            grade = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("That wasn't a number!");
            grade = 0;
        }

        System.out.println("You entered grade " + grade);

        if (grade >= 90 && grade <= 100) {
            IO.println("A");
        } else if (grade >= 80 && grade < 90) {
            IO.println("B");
        } else if (grade >= 70 && grade < 80) {
            IO.println("C");
        } else if (grade >= 60 && grade < 70) {
            IO.println("D");
        } else if (grade < 60 ) {
            IO.println("F");
        } else {
            IO.println("Not a valid number");}
    }
}

