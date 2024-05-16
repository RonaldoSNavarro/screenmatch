package br.com.alura.screenmatch.servicos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class FilmeService {

    public void gerenciarFilmes() {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme("Avatar II", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println("Tempo total calculado: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Filme filmeDoRonaldo = new Filme("Star Wars", 1977);
        filmeDoRonaldo.setDuracaoEmMinutos(200);
        filmeDoRonaldo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoRonaldo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Lista de filmes: " + listaDeFilmes);
        System.out.println("Detalhes do primeiro filme: " + listaDeFilmes.get(0).toString());
    }
}