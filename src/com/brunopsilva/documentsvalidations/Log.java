package com.brunopsilva.documentsvalidations;

public class Log {

    public void out(String message){
        System.out.println(message);
    }

    public void result(String message){
        System.out.println("Resultado: " + message);
    }

    public void success(String message){
        System.out.println("Sucesso: " + message);
    }

    public void attention(String message){
        System.out.println("Atenção: " + message);
    }

    public void error(String message){
        System.out.println("Erro: " + message);
    }

}
