package com.sdajava.swingcal.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-02.
 */
//rozszerzamy o JFrame żeby nie tworzyć obiektu JFrame
        public class CalculatorView extends JFrame{

        private JTextField firstNumber = new JTextField(10);
        private JLabel additionalLabel  = new JLabel("+");
        private JTextField secondNumber = new JTextField(10);
        private JButton calcButton = new JButton("Oblicz");
        private JTextField calcResult = new JTextField(10);


        public CalculatorView() {

            JPanel calcPanel = new JPanel();
            this.setSize(600, 600); //this odwołuje się do pola w klasie

            calcPanel.add(firstNumber);
            calcPanel.add(secondNumber);
            calcPanel.add(calcButton);
            calcPanel.add(additionalLabel);
            calcPanel.add(calcResult);

            this.add(calcPanel); // dodaję do JF

        }

        //liczby wsprowadzamy jako ciagi znaków, więc trzeba je sprasować do int

    public int getFirstNumber(){
        return Integer .parseInt(firstNumber.getText());
    }
     public  int getSecondNumer(){
         return Integer.parseInt(secondNumber.getText());
     }
     public  int getCalcResult(){
         return Integer.parseInt(calcResult.getText());
     }
     public void setCalcResult(int result){
            calcResult.setText(Integer.toString(result));
        }

     public void addCalculateListener(ActionListener actionListener){
            calcButton.addActionListener(actionListener);               //nasłuchiwanie przycisku w celu wykonania akcji
        }
}
