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

        int verifierValidatorOne;
        int verifierValidatorTwo;

        int sum = 0;
        int remainder;
        int multiplierOne = 10;
        int multiplierTwe = 11;

        for(int i = 0; i < 9; i++){
            String digito = numberCpf.substring(i, i + 1);
            int numero = Integer.parseInt(digito) * multiplierOne;
            sum += numero;
            multiplierOne--;
        }

        remainder = sum % 11;
        remainder = 11 - remainder;

        if (remainder < 10){
            verifierValidatorOne = remainder;
        }else{
            verifierValidatorOne = 0;
        }

        if(Integer.parseInt(verifierOne) == verifierValidatorOne){
            sum = 0;
            remainder = 0;

            for(int i = 0; i < 10; i++){
                String digito = numberCpf.substring(i, i + 1);
                int numero = Integer.parseInt(digito) * multiplierTwe;
                sum += numero;
                multiplierTwe--;
            }

            remainder = sum % 11;
            remainder = 11 - remainder;

            if (remainder < 10){
                verifierValidatorTwo = remainder;
            }else{
                verifierValidatorTwo = 0;
            }

            if(Integer.parseInt(verifierTwo) == verifierValidatorTwo) {
                return true;
            }
        }
        return false;
    }

}
