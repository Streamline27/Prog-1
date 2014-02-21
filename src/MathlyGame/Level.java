package MathlyGame;

/**
 * Created by AZAEL on 2/20/14.
 */
public enum Level
{
    EASY(1, 10), MEDIUM(2, 50), HARD(3, 1000);

    private int ratio;
    private int maxNumb;

    public int getMaxNumb()
    {
        return maxNumb;
    }

    Level(int i, int maxNumber)
    {
        ratio = i;
        maxNumb = maxNumber;

    }

    public int getRatio()
    {
        return ratio;
    }
}
