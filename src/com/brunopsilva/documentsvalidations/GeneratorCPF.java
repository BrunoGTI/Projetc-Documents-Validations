package com.brunopsilva.documentsvalidations;

import java.util.Random;

public class GeneratorCPF {

    public void generator(boolean score){
        String numberCpf = "";

        Random random = new Random();
        Log log = new Log();

        for(int i = 0; i < 9; i++){
            numberCpf += Integer.toString(random.nextInt(9));
        }

        DigitGenerator digitGenerator = new DigitGenerator(numberCpf);
        numberCpf += digitGenerator.generator(true);

        DigitGenerator digittGenerator = new DigitGenerator(numberCpf);
        numberCpf += digittGenerator.generator(false);

        if(score){
            log.result(numberCpf.substring(0,3) + "." +
                        numberCpf.substring(3,6) + "." +
                        numberCpf.substring(6, 9) + "-" +
                        numberCpf.substring(9, 11));
        }else{
            log.result(numberCpf);
        }
    }
}
