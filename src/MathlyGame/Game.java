package MathlyGame;

import MathlyGame.Statements.*;

import java.util.Random;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Game
{
    private int randomNumber(int min, int max)
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private Player Az = new Player();
    private int count = 0;

    private Statement s;
    private boolean gameOver = false;

    private static Level hardness;

    public static Level getHardness()
    {
        return hardness;
    }

    public Game()
    {
        this.hardness = Level.EASY;
    }

    public Game(Level h)
    {
        this.hardness = h;
    }

    public void go()
    {
        do
        {
            switch (randomNumber(1, 3))
            {
                case 1:
                    s = new Plus();
                    break;
                case 2:
                    s = new Minus();
                    break;
                case 3:
                    s = new Multiply();
                    break;
                case 4:
                    s = new Divide();
                    break;
                case 5:
                    s = new Sqrt();
                    break;
                default:
                    s = new Plus();
                    break;
            }

            s.showStatement();

            if (Az.readAnswer() == s.getResult())
            {
                Az.setPoints( Az.getPoints() + s.getScore() );
                ++count;
            }
            else
                gameOver = true;

        } while(!gameOver);

        System.out.println("Incorrect, correct answer was " + s.getResult());
        System.out.println("Your final score: " + Az.getPoints());
    }

    public void newStatement()
    {

    }

}
