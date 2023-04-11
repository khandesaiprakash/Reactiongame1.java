
import java.util.Date;
import java.util.Scanner;

public class ReactionGamePart1 {
    /* Simple reaction game using input, output and variables
     *
     *    
     * Use the main method to create a game which does the following:
     *
     * 1. Print out "Be ready!"
     * 2. sleep for 5 seconds.
     * 3. Print out "Quick, hit the enter key!"
     * 4. Wait for the key press and count the seconds.
     * 5. Prints out the seconds the user needed to press the enter button. "You took 0.8179998397827148 seconds."
     *
     */
    public static final void main(String args[]) {

        // ***** Fill in your solution here! *****

        Scanner scanner = new Scanner(System.in);

        System.out.println("Be ready!");
        sleepFor(5);
        double start = getNowSeconds();
        System.out.println("Quick, hit the Enter key!");
        scanner.nextLine();
        double End = getNowSeconds();
        System.out.println(End-start);
        System.out.println("End");
    }

    // Use the methods below to create the game

    /**
     * This method pauses the program for an specific amount of seconds.
     *
     * @param seconds The duration of seconds as an Integer to pause the program.
     */
    private static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of seconds since January 1, 1970
     *
     * @return The seconds as a Double since January 1, 1970
     */
    private static double getNowSeconds() {
        return new Date().getTime() / 1000.0;
    }
}