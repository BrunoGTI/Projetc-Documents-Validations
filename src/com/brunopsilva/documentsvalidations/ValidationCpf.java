package com.brunopsilva.documentsvalidations;

public class ValidationCpf {

    private String numberCpf;

    private static final int MAXIMUM_SIZE = 11;

    public ValidationCpf(String numberCpf){

        numberCpf = numberCpf.replaceAll("[^0-9]+", "");

        if(numberCpf.length() > MAXIMUM_SIZE){
            System.out.println("O número digitado é maior que 11 digitos.");

        }else if(numberCpf.length() < MAXIMUM_SIZE){
            System.out.println("O número digitado é menor que 11 digitos.");

        }else{
            this.numberCpf = numberCpf;
            validation();

        }
    }

    public boolean validation(){

        return true;

    }

}
