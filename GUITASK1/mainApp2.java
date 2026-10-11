package GUITASK1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainApp2 implements ActionListener {
    JFrame frame;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int count = 0;
    String str = "";
    boolean wins = false;
    Color color;
    mainApp2(){
       frame = new JFrame("Tic Tac Toe Game");
       frame.setSize(500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       GridLayout gl = new GridLayout(3,3);
       frame.setLayout(gl);

       btn1 = new JButton();
       btn1.addActionListener(this);
       frame.add(btn1);

       btn2 = new JButton();
       btn2.addActionListener(this);
       frame.add(btn2);

       btn3 = new JButton();
       btn3.addActionListener(this);
       frame.add(btn3);

       btn4 = new JButton();
       btn4.addActionListener(this);
       frame.add(btn4);

       btn5 = new JButton();
       btn5.addActionListener(this);
       frame.add(btn5);

       btn6 = new JButton();
       btn6.addActionListener(this);
       frame.add(btn6);

       btn7 = new JButton();
       btn7.addActionListener(this);
       frame.add(btn7);

       btn8 = new JButton();
       btn8.addActionListener(this);
       frame.add(btn8);

       btn9 = new JButton();
       btn9.addActionListener(this);
       frame.add(btn9);

       frame.setVisible(true);
    }
    static void main() {
        new mainApp2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if(count%2 == 0){
           str = "O";
           color = Color.YELLOW;
        }
        else{
            str = "X";
            color = Color.CYAN;
        }
   if(e.getSource()==btn1){
       btnDesign(btn1);
       btn1.setFont(new Font("Arial",Font.BOLD,50));
       btn1.setText(str);
       btn1.setEnabled(false);
   }
   if(e.getSource()==btn2){
       btnDesign(btn2);
       btn2.setFont(new Font("Arial",Font.BOLD,50));
       btn2.setText(str);
       btn2.setEnabled(false);
   }
   if(e.getSource()==btn3){
       btnDesign(btn3);
       btn3.setFont(new Font("Arial",Font.BOLD,50));
       btn3.setText(str);
       btn3.setEnabled(false);
   }
   if(e.getSource()==btn4){
       btnDesign(btn4);
       btn4.setFont(new Font("Arial",Font.BOLD,50));
       btn4.setText(str);
       btn4.setEnabled(false);
   }
   if(e.getSource()==btn5){
       btnDesign(btn5);
       btn5.setFont(new Font("Arial",Font.BOLD,50));
       btn5.setText(str);
       btn5.setEnabled(false);
   }
   if(e.getSource()==btn6){
       btnDesign(btn6);
       btn6.setFont(new Font("Arial",Font.BOLD,50));
       btn6.setText(str);
       btn6.setEnabled(false);
   }
   if(e.getSource()==btn7){
       btnDesign(btn7);
       btn7.setFont(new Font("Arial",Font.BOLD,50));
       btn7.setText(str);
       btn7.setEnabled(false);
   }
   if(e.getSource()==btn8){
       btnDesign(btn8);
       btn8.setFont(new Font("Arial",Font.BOLD,50));
       btn8.setText(str);
       btn8.setEnabled(false);
   }
   if(e.getSource()==btn9){
       btnDesign(btn9);
       btn9.setFont(new Font("Arial",Font.BOLD,50));
       btn9.setText(str);
       btn9.setEnabled(false);
   }
   winningPosiblities();
   whowins();
    }
    public void winningPosiblities(){
        //horizontal winning connection
        if(btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && !btn1.getText().isEmpty()){
//            JOptionPane.showMessageDialog(frame,str+" is wins !");
            wins = true;
        }
         else if(btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && !btn6.getText().isEmpty()){
            wins = true;
        }
        else if(btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && !btn9.getText().isEmpty()){
            wins = true;
        }
        //Vertical winning connection
       else if(btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && !btn7.getText().isEmpty()){
            wins = true;
        }
        else if(btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && !btn8.getText().isEmpty()){
            wins = true;
        }
        else if(btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && !btn9.getText().isEmpty()){
            wins = true;
        }
        //Cross connection
        else if(btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && !btn9.getText().isEmpty()){
            wins = true;
        }
        else if(btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && !btn7.getText().isEmpty()){
            wins = true;
        }
    else{
            wins = false;
        }
        }
        public void whowins(){
        if(wins){
            JOptionPane.showMessageDialog(frame,str+" is wins !");
            restartGame();
        }
        else if(count == 9 && !wins){
            JOptionPane.showMessageDialog(frame," Match draw !");
            restartGame();
        }
        }
        public void restartGame(){
       int i =  JOptionPane.showConfirmDialog(frame,"Do you want to the restart the Game?");
            if(i == 0){
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");

                btn1.setBackground(null);
                btn2.setBackground(null);
                btn3.setBackground(null);
                btn4.setBackground(null);
                btn5.setBackground(null);
                btn6.setBackground(null);
                btn7.setBackground(null);
                btn8.setBackground(null);
                btn9.setBackground(null);

               btnEnabled(true);

                count = 0;
                str = "";
                wins = false;
            }
            else if(i==1){
                System.exit(0);
            }
            else if(i == 2){
               btnEnabled(false);
            }
        }
        public void btnEnabled(boolean status){
            btn1.setEnabled(status);
            btn2.setEnabled(status);
            btn3.setEnabled(status);
            btn4.setEnabled(status);
            btn5.setEnabled(status);
            btn6.setEnabled(status);
            btn7.setEnabled(status);
            btn8.setEnabled(status);
            btn9.setEnabled(status);
        }
        public void btnDesign(JButton btn){
            btn.setBackground(color);
        }

    }


