package MathlyGame;

import java.util.Scanner;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Player
{
    private int points;
    private Scanner in = new Scanner(System.in);

    public Player()
    {
        this.points = 0;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public int readAnswer()
    {
        return in.nextInt();
    }
}
