package TestFeatures.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Package TestFeatures.GUI in Prog project.
 * Created by Cibulskis on 14.10.2.
 */
public class SwingGui
{
    public static void main(String[] args)
    {
        // Getting user screen resolution
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        final int screenWidth = screenSize.width;
//        final int screenHeight = screenSize.height;

        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SimpleFrame f = new SimpleFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);
                f.setTitle("SOME NICE TITLE");
            }
        });
    }
}

class SimpleFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    /*public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }*/

    public SimpleFrame(int width, int height)
    {
        setSize(width, height);
    }

    public SimpleFrame()
    {
        add(new GUIMEssage());
        pack();
    }
}

class GUIMEssage extends JComponent
{
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    final int screenWidth = screenSize.width;
    final int screenHeight = screenSize.height;
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    public void paintComponent(Graphics g)
    {
        g.setFont(new Font("TimesRoman", Font.BOLD, 50));
        g.drawString("I'm cool!", MESSAGE_X, MESSAGE_Y);
    }
    public Dimension getPreferredSize() { return new Dimension(600, 300); }
}
