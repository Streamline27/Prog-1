package SwingTesting;

import javax.swing.*;

public class Main {

    public static class Tfibonachi{
        final int Length = 10;
        int numbers[]=new int[Length];

        public void generate(){
            numbers[0]=1; numbers[1]=1;
            for(int i=2; i<Length; i++){
                numbers[i]=numbers[i-2]+numbers[i-1];
            }
        }

        public void println(){
            for(int i=0; i<Length; i++){
                System.out.println(numbers[i]);
            }
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyForm ex = new MyForm();
                ex.setVisible(true);
            }
        });
        Tfibonachi fibonachi = new Tfibonachi();
        fibonachi.generate();
        fibonachi.println();
    }
}
