package br.com.alura.screenmatch.servicos;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.util.GsonUtil;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscreveArquivoService {
    private final Gson gson;

    public EscreveArquivoService() {
        this.gson = GsonUtil.getGson();
    }

    public void escreverJson(List<Titulo> titulos) throws IOException {
        try (FileWriter escrita = new FileWriter("filmes.json")) {
            escrita.write(gson.toJson(titulos));
        }
    }
}