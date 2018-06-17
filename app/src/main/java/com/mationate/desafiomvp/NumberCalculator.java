package com.mationate.desafiomvp;

public class NumberCalculator {

    private ValueCallback callback;

    public NumberCalculator(ValueCallback callback) {
        this.callback = callback;
    }

    public void numberCalculation(String number){
        if (number.trim().length()>0 && Integer.parseInt(number)%2 == 0){

            callback.valuePair();
        }else {
            callback.valueImpair(number);
        }


    }

}
