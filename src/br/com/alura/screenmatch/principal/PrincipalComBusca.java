package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.servicos.BuscaTituloService;
import br.com.alura.screenmatch.servicos.ConversaoService;
import br.com.alura.screenmatch.servicos.EscreveArquivoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        BuscaTituloService buscaService = new BuscaTituloService();
        ConversaoService conversaoService = new ConversaoService();
        EscreveArquivoService escreveArquivoService = new EscreveArquivoService();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.print("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String json = buscaService.buscaTitulo(busca);
                System.out.println("JSON recebido: " + json); // Debugging
                TituloOmdb meuTituloOmdb = conversaoService.jsonParaTituloOmdb(json);
                System.out.println("TituloOmdb: " + meuTituloOmdb); // Debugging
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido: " + meuTitulo); // Debugging
                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro de comunicação: " + e.getMessage());
            }
        }

        try {
            escreveArquivoService.escreverJson(titulos);
            System.out.println("O programa finalizou corretamente");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
