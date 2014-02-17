package TwentyOneGameHome;

/**
 * Created by AZAEL on 2/17/14.
 */
class Game {

    public final static int GOAL = 21;
    public final static int MIN_CHOICE = 0;
    public final static int MAX_CHOICE = 5;

    private boolean p1Turn = true;

    private int p1Points = 0;
    private int p2Points = 0;

    private HumanPlayer p1;
    private AIPlayer p2;

    public Game()
    {
        p1 = new HumanPlayer();
        p2 = new AIPlayer();
    }

    public void go()
    {
        do
        {
            play();
        } while(check());
        gameInfo();
    }


    public void play()
    {
        turnInfo();
        int p1TurnInt =  p1.makeTurn();
        int p2TurnInt = p2.makeTurn();
        if (p1Turn)
        {
            p1.setPoints(p1.getPoints() + p1TurnInt + p2TurnInt);
            p1.offerStop();
        }
        else if (!p1Turn)
        {
            p2.setPoints(p2.getPoints() + p1TurnInt + p2TurnInt);
            p2.offerStop();
        }

    }

    public boolean check()
    {
        if (p1Turn && p1.isStop())
        {
            p1Turn = false;
        }
        else if (p1.isStop() && p2.isStop())
        {
            return false;
        }

        return true;
    }

    private void clearScreen()
    {
        System.out.println("-------------------------------------");
    }

    private void turnInfo()
    {
        clearScreen();
        System.out.println("P1 POINTS: " + p1.getPoints() + " P2 POINTS: " + p2.getPoints());
        System.out.println("WE ARE NOW COLLECTING POINTS FOR " + ((p1Turn) ? "P1" : "P2") );
    }

    private void gameInfo()
    {
        // If there is draw
        if (p1.getPoints() == p2.getPoints())
        {
            System.out.println("DRAW");
        }
        else if (p1.getPoints() >= Game.GOAL
                && p2.getPoints() <= Game.GOAL)
        {

        }

        System.out.println("");
        clearScreen();
    }

}
