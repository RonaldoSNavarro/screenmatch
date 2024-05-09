package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);;
        Filme outroFilme = new Filme("Avatar II", 2023);
        outroFilme.avalia(6);
        Filme filmeDoRonaldo = new Filme("Star Wars", 1977);
        filmeDoRonaldo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoRonaldo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

    }
}
