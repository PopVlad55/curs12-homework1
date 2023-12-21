package birthYear;

public class BirthYearCalculator {
    private static final int CURRENT_YEAR = 2023;

    public static int calculateBirthYear(int age) throws InvalidAgeException {
        if(age <= 0){
            throw new InvalidAgeException("Invalid age");
        }
        int birthYear = CURRENT_YEAR - age;
        return birthYear;
    }

    public static void main(String[] args) {
        try{
            int age = 46;
            int birthYear = calculateBirthYear(age);
            System.out.println(birthYear);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
