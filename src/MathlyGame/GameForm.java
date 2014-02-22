package MathlyGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameForm extends JFrame
                      implements ActionListener{

    private JLabel scoreLabel, equalLabel, statementLabel;
    private JPanel panelTop, panelDown, panelButtons;
    private JPanel panelLeft, panelMid, panelRight;
    private JTextField AnswerField;
    private JButton BRestart, BAnswer;

    private Game Game;


    public GameForm(){
        initUI();
    }

    public void setStatement(String statement){
        statementLabel.setText(statement);
    }

    public void StartGame(){
        Game = new Game();
        Game.go();
    }

    public final void initUI(){

        this.setSize(185, 148);
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

        panelButtons = new JPanel();

        this.add(panelButtons);
        BAnswer = new JButton();
        BRestart = new JButton();
        panelButtons.add(BAnswer);
        panelButtons.add(BRestart);
        BAnswer.setText("Answer");
        BRestart.setText("Restart");



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
