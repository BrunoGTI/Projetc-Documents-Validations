package com.brunopsilva.documentsvalidations;

public class ValidationCpf {

    private static final int MAXIMUM_SIZE = 11;
    private String numberCpf;
    private Log log = new Log();

    public ValidationCpf(String numberCpf){

        numberCpf = numberCpf.replaceAll("[^0-9]+", "");

        if(numberCpf.length() > MAXIMUM_SIZE){
            log.attention("O número digitado é maior que 11 digitos.\n");

        }else if(numberCpf.length() < MAXIMUM_SIZE){
            log.attention("O número digitado é menor que 11 digitos.\n");

        }else{
            this.numberCpf = numberCpf;
            validation();

        }
    }

    public boolean validation(){

        String verifierOne = numberCpf.substring(9, 10);
        String verifierTwo = numberCpf.substring(10, 11);

        DigitGenerator digitGenerator = new DigitGenerator(numberCpf);

        if(Integer.parseInt(verifierOne) == digitGenerator.generator(true)){

            if(Integer.parseInt(verifierTwo) == digitGenerator.generator(false)) {
                return true;
            }

        }
        return false;
    }

}
