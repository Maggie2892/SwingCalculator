package com.sdajava.swingcal.controller;

import com.sdajava.swingcal.model.CalculatorModel;
import com.sdajava.swingcal.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-02.
 */
public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
       this.calculatorView.addCalculateListener(new CalculatorListener());
    }

    class CalculatorListener implements ActionListener{
      @Override  //klasa zagnieżdżona
        public void actionPerformed(ActionEvent e){

          int firstNumer, secondNumber = 0;
          firstNumer = calculatorView.getFirstNumber();
          secondNumber = calculatorView.getSecondNumer();

          calculatorModel.addTwoNumbers(firstNumer,secondNumber);
          calculatorView.setCalcResult(calculatorModel.getCalculatorResult());

      }
    }



}
