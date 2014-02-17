package TwentyOneGameHome;

/**
 * Created by AZAEL on 2/17/14.
 */
abstract class Player {

    private int points;
    private boolean stop = false;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public Player()
    {
        points = 0;
    }

    abstract int makeTurn();
    abstract boolean offerStop();
}
