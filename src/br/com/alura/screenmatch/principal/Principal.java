package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.servicos.FilmeService;
import br.com.alura.screenmatch.servicos.SerieService;

public class Principal {
    public static void main(String[] args) {
        FilmeService filmeService = new FilmeService();
        SerieService serieService = new SerieService();

        filmeService.gerenciarFilmes();
        serieService.gerenciarSeries();
    }
}