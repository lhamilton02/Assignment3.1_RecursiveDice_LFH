import java.util.Random;

class RecDieRoller 
{
    private Random random = new Random();

    public int rollUntilTwo() 
    {
        int rolls = 0;

        while (true) 
        {
            int rollResult = random.nextInt(6) + 1; // Simulate a roll of a 6-sided die
            rolls++;

            if (rollResult == 2)
            {
                return rolls;
            }
        }
    }
}//end class


/**Code prior to update

import java.util.Random;

class RecDieRoller 
{
    private Random r = new Random();

    public void roll()
     {
        int rollResult = r.nextInt(6) + 1; // Simulate a roll of a 6-sided die
        System.out.println(rollResult);

        if (rollResult == 2) 
        {
          
            return;
        }

        roll(); // Recursively call the roll method until a 2 is rolled.
    }
}
**/