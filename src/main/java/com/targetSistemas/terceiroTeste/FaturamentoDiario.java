package com.targetSistemas.terceiroTeste;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.targetSistemas.terceiroTeste.entity.Faturamento;
import com.targetSistemas.terceiroTeste.reader.FaturamentoReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.file.NoSuchFileException;
import java.util.List;

public class FaturamentoDiario {
    public static void main(String[] args) {
        String path = "./src/main/java/com/targetSistemas/terceiroTeste/resources/faturamento.json";


        try {
            List<Faturamento> faturamentos = FaturamentoReader.readListFrom(path);
            System.out.println(faturamentos);
        }catch (NoSuchFileException e){
            System.err.println("Não foi possivel encontrar o json no diretorio " + path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
