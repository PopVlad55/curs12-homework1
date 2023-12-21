import java.util.Scanner;
public class BirthYearScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Your age is: ");
                int age = Integer.parseInt(scanner.nextLine());

                int birthYear = BirthYearCalculator.calculateBirthYear(age);

                System.out.println("Your birth year is: " + birthYear);
                break;
            } catch (NumberFormatException e){
                System.out.println("Error, number invalid");
            } catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
