package com.sdajava.swingcal;

import com.sdajava.swingcal.controller.CalculatorController;
import com.sdajava.swingcal.model.CalculatorModel;
import com.sdajava.swingcal.view.CalculatorView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController = new CalculatorController(calculatorView, calculatorModel);

        calculatorView.setVisible(true);
    }
}
