package insorn.yanin.labs2;

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
