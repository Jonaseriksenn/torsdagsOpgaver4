// Task 2.a
import java.util.Scanner; // Task 2.c

public class Main {
    public static void main(String[] args) {
        // Task 2.b
        System.out.println("Skriv dit navn");

        // Task 2.c
        Scanner scanner = new Scanner(System.in);

        // Task 2.d
        String name = scanner.nextLine();

        // Task 2.e
        System.out.println("Hej " + name);
        System.out.println("Skriv din alder");

        // Task 2.f
        int age = scanner.nextInt();

        // Task 2.g
        System.out.println("Du er " + age + " år gammel");

        // Task 2.h
        int retirementAge = 67;
        int yearsToRetirement = retirementAge - age;

        System.out.println("Du har " + yearsToRetirement + " år til pension");
    }
}