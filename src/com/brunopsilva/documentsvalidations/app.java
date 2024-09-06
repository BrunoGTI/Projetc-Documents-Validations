package com.brunopsilva.documentsvalidations;

import java.util.Scanner;

public class app {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Log log = new Log();

        log.success("Project active");

        boolean status = true;

        while(status){
            log.out("Escolha uma das letras: (V) - Verificar CPF, (P) - Opção2, (E) - Sair");
            String value = scanner.nextLine();

            if(value.equalsIgnoreCase("v")){
                log.out("\nDigite o número do cpf");
                String numberCpf = scanner.nextLine();

                ValidationCpf validationCpf = new ValidationCpf(numberCpf);

            }else if(value.equalsIgnoreCase("p")){
                log.out("Opção 2");

            }else if(value.equalsIgnoreCase("e")){
                break;

            }else{
                log.out("Nenhuma das opções foi escolhida\n");
            }

        }

    }

}
