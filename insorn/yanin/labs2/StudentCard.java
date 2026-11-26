package insorn.yanin.labs2;

public class StudentCard {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly three arguments");
            return;
        }
        String name = args[0].toUpperCase();
        String ID = args[1];
        int year = Integer.parseInt(args[2]);
        final int CURRENT_YEAR = 2026;
        int age = CURRENT_YEAR - year;

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("age in 2026: " + age);
    }
}