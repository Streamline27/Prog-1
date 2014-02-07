package TestFeatures;

/**
 * Created by Cibulskis on 14.1.2.
 */
public class Constructors
{
    // Constant
    public static final String AUTHOR = "Cibulskis";

    protected int i;

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
        // System.out.println(i);
    }

    public Constructors(String msg)
    {
        System.out.println(msg);
    }

}

