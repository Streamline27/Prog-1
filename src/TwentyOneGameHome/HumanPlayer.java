package TwentyOneGameHome;

import java.util.Scanner;

/**
 * Created by AZAEL on 2/17/14.
 */
class HumanPlayer extends Player {

    Scanner in;

    HumanPlayer()
    {
        super();
        in = new Scanner(System.in);
    }

    @Override
    int makeTurn()
    {
        System.out.print("You choose: ");
        int number;
        do
        {
            number = in.nextInt();
        } while(number < Game.MIN_CHOICE || number > Game.MAX_CHOICE);

        return number;
    }

    @Override
    boolean offerStop()
    {
        System.out.println("Would you like to stop? (true/false)");
        boolean choice = in.nextBoolean();
        setStop(choice);
        return choice;
    }
}
