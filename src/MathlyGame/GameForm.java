package MathlyGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GameForm extends JFrame
                      implements ActionListener
{

    private JLabel scoreLabel, equalLabel, statementLabel;
    private JPanel panelTop, panelDown, panelButtons;
    private JPanel panelLeft, panelMid, panelRight;
    private JTextField AnswerField;
    private JButton BRestart, BAnswer, BStart;

    private Game Game;

    public class CloseListener extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e){
            System.out.println("HEY");

        }

    }


    public GameForm(){
        initUI();
    }

    public void setStatement(String statement){
        statementLabel.setText(statement);
    }

    public void StartGame(){
        Game = new Game();
         // Game.go();
    }

    public final void initUI(){

        this.addWindowListener(new CloseListener());
        this.setSize(430, 296);
        this.setLocationRelativeTo(null);
        this.setTitle("MyForm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
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
        scoreLabel.setFont(new Font("sans-serif", Font.PLAIN, 40));
        panelTop.add(scoreLabel);
        //done
        //Razbiraem Down Panel
        this.add(panelDown);
        panelDown.setLayout(new BoxLayout(panelDown, BoxLayout.LINE_AXIS));
        panelDown.add(panelLeft); panelDown.add(panelMid); panelDown.add(panelRight);

        statementLabel = new JLabel(":)");
        statementLabel.setFont(new Font("sans-serif", Font.PLAIN, 40));
        panelLeft.add(statementLabel);

        equalLabel = new JLabel("=");
        equalLabel.setFont(new Font("sans-serif", Font.PLAIN, 40));
        panelMid.add(equalLabel);

        AnswerField = new JTextField(8);
        panelRight.add(AnswerField);

        //Razbiraem panel dla knopok
        panelButtons = new JPanel();
        this.add(panelButtons);
        BAnswer = new JButton();
        BRestart = new JButton();
        BStart = new JButton();
        panelButtons.add(BAnswer);
        panelButtons.add(BRestart);
        panelButtons.add(BStart);
        BAnswer.setFont(new Font("sans-serif", Font.PLAIN, 32));
        BRestart.setFont(new Font("sans-serif", Font.PLAIN, 32));
        BStart.setFont(new Font("sans-serif", Font.PLAIN, 32));
        AnswerField.setFont(new Font("sans-serif", Font.PLAIN, 32));

        BAnswer.setText("Answer");
        BRestart.setText("Restart");
        BAnswer.setVisible(false);
        BRestart.setVisible(false);
        BStart.setText("Start");
        //done
        //Nastraivaem slushatelji
        BAnswer.addActionListener(this);
        BRestart.addActionListener(this);
        BStart.addActionListener(this);
        BAnswer.setActionCommand("Answer");
        BRestart.setActionCommand("Restart");
        BStart.setActionCommand("Start");
        this.getRootPane().setDefaultButton(BStart);
        Game = new Game();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Start".equals(e.getActionCommand())){
            DoStart();
        }
        if ("Answer".equals(e.getActionCommand())){
            OnAnswer();
        }
        if ("Restart".equals(e.getActionCommand())){
            NewGame();
        }


    }

    private void OnAnswer(){
        try
        {
            int result = Integer.parseInt(AnswerField.getText());
            if (Game.gameGoing(result))
            {
                scoreLabel.setText("Score: "+Game.getScore());
                statementLabel.setText(Game.generateStatement());
                AnswerField.setText("");
            }
            else
            {
                scoreLabel.setText("Final SCORE: "+Game.getScore());
                statementLabel.setText("Anwer");
                equalLabel.setText("is");
                AnswerField.setText(""+Game.getCorrectAnswer());
                BAnswer.setVisible(false);
                this.getRootPane().setDefaultButton(BRestart);

            }
        }
        catch(NumberFormatException e)
        {
            AnswerField.setText("");

        }

    }

    private void NewGame(){
        Game = new Game();
        this.getRootPane().setDefaultButton(BAnswer);
        statementLabel.setText(Game.generateStatement());
        BAnswer.setVisible(true);
        AnswerField.setText("");
        scoreLabel.setText("SCORE:");
        AnswerField.setText("");
        equalLabel.setText("=");
    }

    private void DoStart() {
        this.getRootPane().setDefaultButton(BAnswer);
        AnswerField.setText("");
        BStart.setVisible(false);
        BAnswer.setVisible(true);
        BRestart.setVisible(true);

        statementLabel.setText(Game.generateStatement());

    }
}
