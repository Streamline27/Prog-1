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

    private void checkHardness()
    {
        if (count == 15)
            hardness = Level.MEDIUM;
        else if(count == 30)
            hardness = Level.HARD;
    }

    private void newStatement()
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
//Interfeisnaya chast'
    public Game(Level h)
    {
        this.hardness = h;
    }

    public String generateStatement(){
        checkHardness();
        newStatement();
        return(s.getStatement());
    }

    public String getStatement(){
        return(s.getStatement());
    }


    public boolean gameGoing(int Result){
        if(Result==s.getResult())
        {
            Az.setPoints( Az.getPoints() + s.getScore() );
            ++count;
            return true;
        }
        else
            return GameOver();
    }

    public int getScore(){
        return Az.getPoints();
    }

    public int getCorrectAnswer(){
        return s.getResult();
    }


    public boolean GameOver(){
        gameOver=true;
        return false;
    }





}
