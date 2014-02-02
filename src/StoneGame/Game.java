package StoneGame;

import TestFeatures.Constructors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Cibulskis on 14.1.2.
 */
public class Game
{
    public static int randInt(int min, int max)
    {
        /* RANDOM! */
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);

        byte p1 = 3; int p1Guess; int p1Taken;
        byte p2 = 3; int p2Guess; int p2Taken; // p2 is CPU random
        boolean p1Turn = true;
        byte round = 0;

        System.out.println("Stone game");

        // Play till one of the players have ran out of the stones
        while (p1 > 0 && p2 > 0)
        {
            System.out.println("------------------");
            System.out.println("Round: " + ++round);

            System.out.println(" You have " + p1 + " stones; CPU has " + p2 + " stones");
            System.out.println(" How much stones you're taking: ");

            // Choosing count of available stones
            do
                p1Taken = in.nextInt();
            while(p1Taken > p1 || p1Taken < 0);

            p2Taken = Game.randInt(0, p2);

            if (p1Turn)
            {
                System.out.println(" Your guess is: ");
                p1Guess = in.nextInt();

                // Taking
                do
                {
                    int rand_min = p1Guess - p2;
                    if (rand_min < 0)
                        rand_min = 0;
                    p2Guess = Game.randInt(rand_min, p1 + p2);
                }
                while(p2Guess == p1Guess);

                System.out.println("CPU is thinking of: " + p2Guess);
            }
            else
            {
                // Getting random starting with how much stones have p2 taken, till count of stones (our taken + p1 max count)
                p2Guess = Game.randInt(p2Taken, p2Taken + p1);

                System.out.println("CPU is thinking of: " + p2Guess);
                System.out.println(" Your guess is: ");

                // Blocking us from equal guess
                do
                    p1Guess = in.nextInt();
                while(p1Guess == p2Guess);
            }

            System.out.println("We took: " + p1Taken + " P2 took: " + p2Taken + " stones");
            // If we won
            if (p1Guess == (p1Taken + p2Taken))
            {
                System.out.println("We won " + round + ". round");
                --p1;
                p1Turn = true;
            }
            // If CPU won
            else if (p2Guess == (p1Taken + p2Taken))
            {
                System.out.println("CPU won " + round + ". round");
                --p2;
                p1Turn = false;
            }
            // Swap turns
            else
                p1Turn = !p1Turn;
        }
        // Announcing winner
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if (p1 == 0)
            System.out.println("PLAYER 1 HAS WON");
        else
            System.out.println("CPU HAS WON");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
