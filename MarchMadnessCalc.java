import java.util.Scanner;

public class MarchMadnessCalc {
    
    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in);
    int playercount;
    int loopcount = 0;
    
    System.out.format("It's March Madness..Time to calculate some Field Goal Statistics for NCAA tournament players.%n%nPlease enter the number of players:%n");
    playercount = userInput.nextInt();
        
    while (playercount < 0 || playercount > 100){ //loop checks for valid number
            System.out.format("Invalid number of players. Try again (1-100):%n%n");
            playercount = userInput.nextInt();
        }
    if(playercount == 0 ){  //end program if player number is 0
            System.out.print("Goodbye!");
            System.out.format("%n%n%n");
            System.exit(0);
        }
    //declare arrays
    String[] name = new String[playercount];
    double[] fgAttempt= new double[playercount];
    double[] fgMade= new double[playercount];
    double[] fgPercent= new double[playercount];
        
        
        //loop for input
        for( int i = 0; i < playercount; i++){
        System.out.format("----------Player " + (i+1) + " ----------%n");
        System.out.format("Please enter the player's ID:%n");
        name[i] = userInput.next();
        System.out.format("Please enter the player's Field Goal Attempts:%n");
        fgAttempt[i] = userInput.nextDouble();
        
            while (fgAttempt[i] < 0 || fgAttempt[i] > 80){ //invalid input loop (attempts)
                System.out.format("Please Try Again. Field Goal Attempts?(0-80):%n%n");
               fgAttempt[i]= userInput.nextDouble();
            }
        System.out.format("Please enter the player's Field Goals Made:%n");
        fgMade[i] = userInput.nextDouble();
        
            while (fgMade[i] < 0 || fgMade[i] > 80){ //invalid input loop (Made)
                System.out.format("Please Try Again. Field Goals Made?(0-80):%n");
                fgMade[i]= userInput.nextDouble();
            }
            fgPercent[i] = 100*(fgMade[i] / fgAttempt[i]);
    
    }
        
        int s = 0;
        double fgAverage = 0;
        while(s<playercount){
            fgAverage = fgAverage + fgMade[s]; //sum of all made shots
            s = s + 1;
        }
        fgAverage = fgAverage / playercount; //average shots made for all players
        
        
        //final output
        System.out.format("--------------------------------------Field Goal Statistics-----------------------------------------%n");
        System.out.printf("%-17s %-28s %-25s %-30s%n","PlayerID:","Field Goal Attempts:","Field Goals Made:" , "Field Goal Percentage:");
        int y = 0;
        while(y < playercount){ //loops output to pull from each array
            System.out.format("%-17s %-28s %-25s %-30s%n",name[y],fgAttempt[y],fgMade[y],String.format("%.2f",fgPercent[y]));
            System.out.format("%n");
            y = y + 1;
        }
        System.out.format("Average Field Goals Made: " + String.format("%.2f", fgAverage) + "%n%n");
        System.out.print("-------------------------------Thanks For Using Our Program---------------------------------");
    }

} //final bracket

