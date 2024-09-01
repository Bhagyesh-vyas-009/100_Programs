import java.util.Scanner;

public class P14 {

    // Definition of Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get hours and minutes from user
        System.out.print("Enter hours (1-12): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        if(hours>12 || hours<0|| minutes>=60 || minutes<0)
        {
            System.out.println("Enter Valid Time");
            System.exit(0);
        }
        // Processing: Calculate the angle between hour and minute hands
        double angle = Math.abs((hours * 30) - (minutes * 5.5));

        // Output: Display the calculated angle
        System.out.println("The angle between the hour and minute hand is: " + angle + " degrees");

        scanner.close();
    }

    // Definition of calculateAngle method
    // public static double calculateAngle(int hours, int minutes) {
    // // Adjust hours for 12-hour format
    // if (hours == 12) {
    // hours = 0;
    // }

    // // Calculate the positions of hour and minute hands in degrees

    // }
}
