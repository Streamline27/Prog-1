package MathlyGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Timer;

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

    /**
     * Created with IntelliJ IDEA.
     * User: java
     * Date: 14.8.3
     * Time: 11:11
     * To change this template use File | Settings | File Templates.
     */

}
