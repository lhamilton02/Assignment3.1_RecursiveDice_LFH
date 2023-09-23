/**
 * `RecDieRollerDriver` class represents a driver program for calculating
 * the mean number of rolls needed to get a 2 in a series of simulations.
 */
public class RecDieRollerDriver 
{
    /**
     * Main method
     * 
     * @author lhamilton2
     */
    public static void main(String[] args) 
    {
        // Create an instance of the RecDieRoller class to simulate die rolls.
        RecDieRoller roller = new RecDieRoller();
        
        // Initialize variables to keep track of the total number of rolls and the number of simulations.
        int totalRolls = 0;
        int numSimulations = 1000;

        // Perform a series of simulations to calculate the mean number of rolls to get a 2.
        for (int i = 0; i < numSimulations; i++) 
        {
            // Roll the die until a 2 is obtained and add the number of rolls to the total.
            totalRolls += roller.rollUntilTwo();
        }

        // Calculate the mean number of rolls by dividing the total rolls by the number of simulations.
        double meanRolls = (double) totalRolls / numSimulations;
        
        // Print the result, which represents the average number of die rolls to get a 2.
        System.out.println("Mean number of die rolls to get a 2: "  + meanRolls);
    }
}//end class




/** code prior to update

public class RecDieRollerDriver 
{
    public static void main(String[] args) 
    {
    
        RecDieRoller roller = new RecDieRoller();
        roller.roll();
    }
}
**/



 

