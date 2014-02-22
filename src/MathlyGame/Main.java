package MathlyGame;

import SwingTesting.MyForm;

import javax.swing.*;

/**
 * Created by AZAEL on 2/20/14.
 */
public class Main
{
    public static void main(String[] args)
    {



        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameForm TheGameForm = new GameForm();
                TheGameForm.setVisible(true);
            }
        });
    }
}
