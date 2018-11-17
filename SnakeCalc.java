import java.util.Scanner;

class SnakeCalc {

    public static void main(String args[]){
        int totEggs = 0;
        
        // open scanner
        Scanner userInput = new Scanner(System.in);
        System.out.format("This is the Python Snake Estimator Program.%nIt estimates the number of eggs that a female python will produce over a lifetime.%nPlease enter HISS if you want run the program or STOP to quit.%n");
        String playPause = userInput.next();
        //conditional loop
        while (playPause.equalsIgnoreCase("HISS")){
            //declare variables
            int cyEgg = 35;
            int pyEgg = 0;
            int soaEgg = 35;
            int snakeAge;
            // ID
            System.out.format("Enter the Python ID:%n");
            String snakeID = userInput.next();
            // AGE
            System.out.format("Enter the age of the python in years:%n");
            snakeAge = userInput.nextInt();
            // AGE LOOP
            while (snakeAge > 20 || snakeAge < 1){
                System.out.format("INVALID AGE: Please enter an age between 1 and 20:%n");
                snakeAge = userInput.nextInt();
            }
            //processing
            System.out.printf("%-2s %-2s %-2s %-2s%n", "Year", "Previous Year", "Current Year", "Sum of All Eggs");
            System.out.printf("%-13s %-12s %-15s %-15s%n", snakeAge, pyEgg, cyEgg, soaEgg);
            while (snakeAge < 20){
                snakeAge += 1;
                pyEgg = pyEgg + cyEgg;
                soaEgg = cyEgg + pyEgg;
                System.out.printf("%-13s %-12s %-15s %-15s%n", snakeAge, pyEgg, cyEgg, soaEgg);
            }
            //final output
            System.out.println(snakeID + " will lay a total of " + soaEgg + " eggs over her remaining lifetime of 20 years");
            totEggs = soaEgg + totEggs;
            //terminate for final sum or rerun loop
            System.out.format("%nPlease enter HISS if you want run the program or STOP to quit.%n");
            String loopplayPause = userInput.next();
            //check value hiss or stop loop
            if (loopplayPause.equalsIgnoreCase("STOP")) {
                System.out.format("The sum of all eggs for all Pythons processed is:        " + totEggs + "%n");
                System.exit(0);
                }
            else if (loopplayPause.equalsIgnoreCase("HISS")) {
                continue;
            }
        }
    }
}
