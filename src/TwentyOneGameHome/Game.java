package TwentyOneGameHome;

/**
 * Created by AZAEL on 2/17/14.
 */
class Game {

    public final static int GOAL = 21;
    public final static int MIN_CHOICE = 0;
    public final static int MAX_CHOICE = 5;

    HumanPlayer p1;
    AIPlayer p2;

    public Game()
    {
        p1 = new HumanPlayer();
        p2 = new AIPlayer();
    }

    public void play()
    {

    }

    public boolean check()
    {
        return true;
    }

    public void turnInfo()
    {

    }

    public void gameInfo()
    {

    }

}
