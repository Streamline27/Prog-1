package Chess;

public class Main
{
    public static void Main()
    {
        Game g = new Game();

        boolean state;
        do
        {
            state = g.go();
        } while(state);
    }
}
