/**
 * EmailChecker checks whether an email address given as 
 * a program argument is a KKU student email, a KKU staff email, or not a KKU email.
 * 
 * Author: Yanin Insorn
 * ID: 693040430-6
 * Sec: 1
 * Last updated: 2026-11-28
 */
package insorn.yanin.lab2;

public class EmailChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly one arguments");
            return;
        }
        String email = args[0];
        String lowerEmail = email.toLowerCase();
        String result;
        if (lowerEmail.endsWith("@kkumail.com")) {
            result = "a KKU student email";
        } else if (lowerEmail.endsWith("@kku.ac.th")) {
            result = "a KKU staff email";
        } else {
            result = "not a KKU email";
        }

        System.out.println(email + " is " + result);
    }

}
