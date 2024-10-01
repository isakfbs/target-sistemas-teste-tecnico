package com.targetSistemas.terceiroTeste.reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.targetSistemas.terceiroTeste.entity.Faturamento;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FaturamentoReader extends AbstractReader{

    public static List<Faturamento> readListFrom(String path) throws IOException {
        String jsonText = readJson(path);
        Type collectionType = new TypeToken<List<Faturamento>>(){}.getType();
        return new Gson().fromJson(jsonText, collectionType);
    }

}
