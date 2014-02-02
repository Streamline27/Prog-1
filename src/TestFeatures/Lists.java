package TestFeatures;

import java.util.ArrayList;

/**
 * Created by Cibulskis on 14.2.2.
 */
public class Lists
{
    private static ArrayList<Integer> num = new ArrayList<Integer>();
    protected static void TestArrayList(int N)
    {
        for (int i = 0; i < N; ++i)
        {
            num.add(i);
        }

        for (int n: num)
        {
            System.out.println(n);
        }
    }
}
