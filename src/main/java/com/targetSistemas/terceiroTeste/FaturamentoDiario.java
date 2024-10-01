package com.terceiro;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturamentoDiario {
    public static void main(String[] args) {
        String jsonData = lerArquivo("faturamento.json");
        System.out.println(jsonData);
    }
    private static String lerArquivo(String path){
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
