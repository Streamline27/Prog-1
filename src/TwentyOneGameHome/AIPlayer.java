package TwentyOneGameHome;

import java.util.Random;

/**
 * Created by AZAEL on 2/17/14.
 */
class AIPlayer extends Player
{
    private static int randInt(int min, int max)
    {
        /* RANDOM! */
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public AIPlayer()
    {
        super();
    }

    @Override
    int makeTurn()
    {
        int number = AIPlayer.randInt(Game.MIN_CHOICE, Game.MAX_CHOICE);
        return number;
    }

    @Override
    boolean offerStop()
    {
        if (getPoints() >= 17)
        {
            setStop(true);
            System.out.println("AI stopped");
        }
        else
            System.out.println("AI refused to stop");

        return isStop();
    }
}
