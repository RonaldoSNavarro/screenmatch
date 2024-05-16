package br.com.alura.screenmatch.servicos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListaDeTitulosService {

    public List<Titulo> criarListaDeTitulos() {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar II", 2023);
        outroFilme.avalia(6);
        Filme filmeDoRonaldo = new Filme("Star Wars", 1977);
        filmeDoRonaldo.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoRonaldo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        return lista;
    }

    public void exibirTitulosComClassificacao(List<Titulo> lista) {
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }

    public List<String> criarListaDeArtistas() {
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        return buscaPorArtista;
    }

    public void ordenarListaDeArtistas(List<String> buscaPorArtista) {
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
    }

    public void ordenarListaDeTitulosPorNome(List<Titulo> lista) {
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista);
    }

    public void ordenarListaDeTitulosPorAno(List<Titulo> lista) {
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);
    }
}