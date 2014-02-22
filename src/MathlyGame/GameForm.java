package MathlyGame;

import javax.swing.*;
import java.awt.*;


public class GameForm extends JFrame {

    private JLabel scoreLabel, equalLabel, statementLabel;
    private JPanel panelTop, panelDown;
    private JPanel panelLeft, panelMid, panelRight;
    private JTextField AnswerField;


    public GameForm(){
        initUI();
    }

    public void setStatement(String statement){
        statementLabel.setText(statement);
    }

    public final void initUI(){
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("MyForm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);

        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        //Sozdaem paneli
        panelTop = new JPanel();
        panelDown = new JPanel();
        panelLeft = new JPanel();
        panelMid = new JPanel();
        panelRight = new JPanel();
        //done

        //Razberaem Top Panel
        this.add(panelTop);
        scoreLabel = new JLabel("Score:");
        panelTop.add(scoreLabel);
        //done

        //Razbiraem Down Panel
        this.add(panelDown);
        panelDown.setLayout(new BoxLayout(panelDown, BoxLayout.LINE_AXIS));
        panelDown.add(panelLeft); panelDown.add(panelMid); panelDown.add(panelRight);

        statementLabel = new JLabel("2+2");

        panelLeft.add(statementLabel);

        equalLabel = new JLabel("=");
        panelMid.add(equalLabel);

         AnswerField = new JTextField(8);
        panelRight.add(AnswerField);








    }

}
