package br.com.alura.screenmatch.servicos;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.util.GsonUtil;
import com.google.gson.Gson;

public class ConversaoService {
    private final Gson gson;

    public ConversaoService() {
        this.gson = GsonUtil.getGson();
    }

    public TituloOmdb jsonParaTituloOmdb(String json) {
        return gson.fromJson(json, TituloOmdb.class);
    }
}