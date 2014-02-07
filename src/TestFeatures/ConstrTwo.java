package TestFeatures;

/**
 * Package TestFeatures in Prog project.
 * Created by Cibulskis on 14.7.2.
 */
public class ConstrTwo extends Constructors
{
    public ConstrTwo()
    {
        super("In parent");
        System.out.println("In here");
        System.out.println(this.i);
    }
}
