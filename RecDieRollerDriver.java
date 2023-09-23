
public class RecDieRollerDriver 
{
    public static void main(String[] args) 
    {
        RecDieRoller roller = new RecDieRoller();
        int totalRolls = 0;
        int numSimulations = 1000;

        for (int i = 0; i < numSimulations; i++) 
        {
            totalRolls += roller.rollUntilTwo();
        }

        double meanRolls = (double) totalRolls / numSimulations;
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



 

