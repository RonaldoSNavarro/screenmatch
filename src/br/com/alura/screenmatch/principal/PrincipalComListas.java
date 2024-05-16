package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.servicos.ListaDeTitulosService;

import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        ListaDeTitulosService listaService = new ListaDeTitulosService();

        List<Titulo> lista = listaService.criarListaDeTitulos();
        listaService.exibirTitulosComClassificacao(lista);

        List<String> buscaPorArtista = listaService.criarListaDeArtistas();
        listaService.ordenarListaDeArtistas(buscaPorArtista);

        listaService.ordenarListaDeTitulosPorNome(lista);
        listaService.ordenarListaDeTitulosPorAno(lista);
    }
}