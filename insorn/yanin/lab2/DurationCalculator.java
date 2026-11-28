/**
 * DurationCalculator computes how long an activity took from its start time
 * and end time, given as six program arguments.
 * 
 * Author: Yanin Insorn
 * ID: 693040430-6
 * Sec: 1
 * Last updated: 2026-11-28
 */
package insorn.yanin.lab2;

public class DurationCalculator {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly six arguments");
            return;
        }

        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int startHour = Integer.parseInt(args[0]);
        int startMinute = Integer.parseInt(args[1]);
        int startSecond = Integer.parseInt(args[2]);
        int endHour = Integer.parseInt(args[3]);
        int endMinute = Integer.parseInt(args[4]);
        int endSecond = Integer.parseInt(args[5]);

        int startTotal = startHour * SECONDS_PER_HOUR + startMinute * SECONDS_PER_MINUTE + startSecond;
        int endTotal = endHour * SECONDS_PER_HOUR + endMinute * SECONDS_PER_MINUTE + endSecond;
        int durationSeconds = endTotal - startTotal;

        double durationMinutes = (double) durationSeconds / SECONDS_PER_MINUTE;

        int hours = durationSeconds / SECONDS_PER_HOUR;
        int minutes = (durationSeconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        int seconds = durationSeconds / SECONDS_PER_MINUTE;

        System.out.println("Duration is" + durationMinutes + "minutes");
        System.out.println("That is" + hours + "hours" + minutes + "minutes" + seconds + "seconds");
    }

}