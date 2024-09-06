package com.brunopsilva.documentsvalidations;

public class DigitGenerator {

    private String cpfNumber;

    public DigitGenerator(String numberCpf){
        cpfNumber = numberCpf;
    }

    public int generator(boolean state){
        int sum = 0;
        int remainder;
        int rotation;
        int multiplier;
        int verifierValidator;

        if(state){
            rotation = 9;
            multiplier = 10;
        }else{
            rotation = 10;
            multiplier = 11;
        }

        for(int i = 0; i < rotation; i++){
            String digito = cpfNumber.substring(i, i + 1);
            int number = Integer.parseInt(digito) * multiplier;
            sum += number;
            multiplier--;
        }

        remainder = sum % 11;
        remainder = 11 - remainder;


        if (remainder < 10){
            return verifierValidator = remainder;
        }else{
            return verifierValidator = 0;
        }

    }

}
