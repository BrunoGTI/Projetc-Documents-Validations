package com.brunopsilva.documentsvalidations;

import java.util.Scanner;

public class app {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Log log = new Log();

        log.success("Project active");

        boolean status = true;
        String value = "";

        while(status){
            if(value.equalsIgnoreCase("")){
                log.out("\nDigite uma das letras: (V) - Verificar CPF, (G) - Gerar CPF, (F) - Fechar");
                value = scanner.nextLine();
            }

            if(value.equalsIgnoreCase("v")){
                log.out("\nDigite o número do cpf, digite (R) para retornar");
                String digit = scanner.nextLine();

                if(digit.equalsIgnoreCase("r")){
                    value = "";
                }else{
                    ValidationCpf validationCpf = new ValidationCpf(digit);
                    value = "v";
                }

            }else if(value.equalsIgnoreCase("g")){
                GeneratorCPF generatorCPF = new GeneratorCPF();

                log.out("\nDigite uma das letras: (C) - Gerar CPF com pontuação, (S) - Gerar CPF sem pontuação, (R) - Retornar");
                String score = scanner.nextLine();

                if(score.equalsIgnoreCase("c")){
                    generatorCPF.generator(true);
                    value = "g";
                }else if(score.equalsIgnoreCase("s")){
                    generatorCPF.generator(false);
                    value = "g";
                }else if(score.equalsIgnoreCase("r")){
                    value = "";
                }else{
                    log.out("Nenhuma das opções foi escolhida\n");
                    value = "g";
                }

            }else if(value.equalsIgnoreCase("f")){
                break;

            }else{
                log.out("Nenhuma das opções foi escolhida\n");
            }
        }
    }
}
