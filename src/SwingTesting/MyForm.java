package SwingTesting;


import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyForm extends JFrame
                    implements ActionListener{
    private JPanel panel1, panel2, FormPanel;
    private JButton b1, b2;
    private JTextField text;
    public MyForm(){
        initUI();
    }

    public final void initUI(){
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("MyForm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);



    /* Создаём панели для формы */
        JPanel FormPanel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
    /*Настраиваем панели */
        FormPanel.setLayout(new BoxLayout(FormPanel, BoxLayout.LINE_AXIS));
        this.add(FormPanel);
        FormPanel.add(panel1);
        FormPanel.add(panel2);
    /*Кнопки*/
        b1=new JButton("Button 1");
        b1.setActionCommand("b1");
        b1.addActionListener(this);

        b2=new JButton("Button 2");
        b2.setActionCommand("b2");
        b2.addActionListener(this);

        text = new JTextField(8);
        panel1.add(text);



        panel1.add(b1);
        panel2.add(b2);

    }


    public void actionPerformed(ActionEvent e) {
        if("b1".equals(e.getActionCommand())){
            b2.setEnabled(true);
            b1.setEnabled(false);
        }
        if("b2".equals(e.getActionCommand())){
            b1.setEnabled(true);
            b2.setEnabled(false);
        }
}

}
