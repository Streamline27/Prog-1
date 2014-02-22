package MathlyGame;

import MathlyGame.Statements.*;
import SwingTesting.MyForm;

import javax.swing.*;
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
    private GameForm GameForm;

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

    public void initForm(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameForm = new GameForm();
                GameForm.setVisible(true);
            }
        });
    }

    public void go()
    {

        initForm();
        do
        {
            checkHardness();

            newStatement();

            System.out.println("Score: " + Az.getPoints());
            s.showStatement();

            if (Az.readAnswer() == s.getResult())
            {
                Az.setPoints( Az.getPoints() + s.getScore() );
                ++count;
            }
            else
                gameOver = true;

        } while(!gameOver);

        System.out.println("LOOSER - The answer is " + s.getResult());
        System.out.println("Your final score: " + Az.getPoints());
    }

    private void checkHardness()
    {
        if (count == 15)
            hardness = Level.MEDIUM;
        else if(count == 30)
            hardness = Level.HARD;
    }

    public void newStatement()
    {
        switch (randomNumber(1, 5))
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
    }

}
