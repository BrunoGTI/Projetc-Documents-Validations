package com.brunopsilva.documentsvalidations;

import java.util.Scanner;

public class app {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Log log = new Log();

        log.success("Project active\n");

        boolean status = true;

        while(status){
            log.out("Digite uma das letras: (V) - Verificar CPF, (G) - Gerar CPF, (F) - Fechar");
            String value = scanner.nextLine();

            if(value.equalsIgnoreCase("v")){
                log.out("\nDigite o número do cpf, digite (R) para retornar");
                String numberCpf = scanner.nextLine();

                ValidationCpf validationCpf = new ValidationCpf(numberCpf);

            }else if(value.equalsIgnoreCase("g")){
                GeneratorCPF generatorCPF = new GeneratorCPF();

                log.out("\nDigite uma das letras: (C) - Gerar CPF com pontuação, (S) - Gerar CPF sem pontuação, (R) - Retornar");
                String score = scanner.nextLine();

                if(score.equalsIgnoreCase("c")){
                    generatorCPF.generator(true);
                }else if(score.equalsIgnoreCase("s")){
                    generatorCPF.generator(false);
                }else if(score.equalsIgnoreCase("r")){
                    return;
                }else{
                    log.out("Nenhuma das opções foi escolhida\n");
                }

            }else if(value.equalsIgnoreCase("f")){
                break;

            }else{
                log.out("Nenhuma das opções foi escolhida\n");
            }
        }
    }
}
