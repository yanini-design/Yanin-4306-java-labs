/**
 * StudentCard prints a student's name in uppercase, student ID, and age in 2026, 
 * given name, student ID, and birth year as three program arguments.
 * 
 * Author: Yanin Insorn
 * ID: 693040430-6
 * Sec: 1
 * Last updated: 2026-11-28
 */
package insorn.yanin.lab2;

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