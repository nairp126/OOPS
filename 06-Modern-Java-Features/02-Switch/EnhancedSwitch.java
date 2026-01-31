// Package removed to match directory structure

/**
 * Modern Java (Java 14+): Switch Expressions.
 * 
 * Problem: The old 'switch' was clunky (needed 'break' everywhere) and couldn't
 * return values.
 * Solution: The '->' syntax. No fall-through, can return values.
 */
public class EnhancedSwitch {

    public static String getDayType(String day) {
        // Old Way:
        /*
         * switch(day) {
         * case "Sat":
         * case "Sun":
         * return "Weekend";
         * default:
         * return "Weekday";
         * }
         */

        // New Way (Switch Expression)
        return switch (day) {
            case "Saturday", "Sunday" -> "Weekend"; // Multiple cases, one line
            case "Monday", "Friday" -> "Work (Hard)";
            default -> "Weekday";
        };
    }

    public static void main(String[] args) {
        System.out.println("Sunday is: " + getDayType("Sunday"));
        System.out.println("Monday is: " + getDayType("Monday"));
    }
}
