package MathlyGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GameTimer {
    Timer CountDownTimer;
    GameForm Frame;
    int Time;

    public GameTimer(GameForm Frame) {
        CountDownTimer = new Timer(1000, new CountDownActionListener());
        CountDownTimer.start();
        Time = 0;
        this.Frame = Frame;
    }

    public void purgeTime(){
        Time = 0;
    }

    public void setTime(int newTime){
        Time = newTime;
    }

    public void addTime(int newTime){
        this.Time=+newTime;
    }

    public int getTime(){
        return Time;
    }

    public boolean TimeGoing(){
        if (Time>0){
            return true;
        }
        else {
            return false;
        }
    }


    class CountDownActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Time>0) Time--;
            Frame.setTimeLabel(Time);



        }
    }



}
