package TestFeatures;

/**
 * Created by Cibulskis on 14.1.2.
 */
public class Constructors
{
    // Constant
    public static final String AUTHOR = "Cibulskis";

    private int i;

    {
        System.out.println("First I'm here, when object created");
    }

    static
    {
        System.out.println("First I'm here, with static keyword");
    }

    public Constructors()
    {
        System.out.println("Default Constructors");
        System.out.println("Checking whether fields are initialised to their default value - null");

        // expected to be 0
        System.out.println(i);
    }

}

class Main
{
    public static void main(String args[])
    {
        Constructors c = new Constructors();
    }
}

