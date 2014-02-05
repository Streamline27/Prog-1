package TestFeatures;

/**
 * Package TestFeatures in Prog project.
 * Created by Cibulskis on 14.4.2.
 */
public class ManyArgs
{
    public static void getStrings(String... text)
    {
        for(String s:text)
        {
            System.out.println(s);
        }
    }

    public static void getIntAndStrings(int i, String... text)
    {
        System.out.println(i);
        for(String s:text)
        {
            System.out.println(s);
        }
    }
}
