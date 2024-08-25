package com.brunopsilva.documentsvalidations;

public class app {

    public static void main(String[] args){
        System.out.println("Project active");

        ValidationCpf validationCpf = new ValidationCpf("000.000.000-00");

        boolean success = validationCpf.validation();

        if(!success){
            System.out.println("CPF invalido.");
        }else{
            System.out.println("CPF valido.");
        }
    }

}
