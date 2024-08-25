package com.brunopsilva.documentsvalidations;

public class app {

    public static void main(String[] args){
        System.out.println("Project active");

        Log log = new Log();
        ValidationCpf validationCpf = new ValidationCpf("000.000.000-0");

        boolean success = validationCpf.validation();

        if(!success){
            log.result("CPF invalido.");
        }else{
            log.result("CPF valido.");
        }
    }

}
