## 🔖 Sobre

# ScreenMatch

O ScreenMatch é uma aplicação Java para gerenciar filmes e séries, permitindo avaliar, listar e ordenar títulos. O projeto é estruturado de forma modular, seguindo princípios de design orientado a objetos para garantir a manutenibilidade e extensibilidade do código.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `br.com.alura.screenmatch.principal`: Contém as classes principais que inicializam a aplicação.
- `br.com.alura.screenmatch.servicos`: Contém classes de serviços responsáveis pela lógica de manipulação de listas e ordenação de títulos.
- `br.com.alura.screenmatch.calculos`: Contém classes para cálculos de tempo e filtros de recomendação.
- `br.com.alura.screenmatch.modelos`: Contém as classes de modelo que representam os dados do domínio (Filme, Serie, Titulo, Episodio).

## Classes Principais

### Principal

A classe `Principal` demonstra o uso das funcionalidades de avaliação, cálculo de tempo e recomendação de filmes e séries.

### PrincipalComBusca

A classe `PrincipalComBusca` lida com a busca de filmes na API OMDB, converte os resultados e salva-os em um arquivo JSON.

### PrincipalComListas

A classe `PrincipalComListas` demonstra a criação, exibição e ordenação de listas de títulos e artistas.

## Classes de Serviço

### BuscaFilmeService

A classe `BuscaFilmeService` é responsável por buscar filmes na API OMDB e converter os resultados.

### SalvarFilmesService

A classe `SalvarFilmesService` é responsável por salvar a lista de títulos em um arquivo JSON.

### ListaDeTitulosService

A classe `ListaDeTitulosService` fornece métodos para criar, exibir e ordenar listas de títulos e artistas.

## Interfaces

### Classificavel

A interface `Classificavel` define o contrato para objetos que possuem uma classificação.

# Técnicas Utilizadas

O projeto ScreenMatch utiliza as seguintes técnicas:

- **Modularidade**: O projeto é dividido em pacotes e classes, seguindo uma estrutura modular para facilitar a organização e manutenção do código.
- **Orientação a Objetos**: Princípios de OOP são seguidos para criar classes que representam objetos do mundo real e encapsulam comportamentos e dados relacionados.
- **Interfaces**: O uso de interfaces permite a implementação de contratos comuns, como a interface `Classificavel`, que permite acesso uniforme à classificação de diferentes tipos de títulos.
- **Polimorfismo**: O polimorfismo é utilizado em várias partes do projeto, permitindo que diferentes classes implementem comportamentos específicos de forma flexível.
- **Tratamento de Exceções**: O projeto trata exceções de forma adequada para lidar com situações inesperadas durante a execução do programa.
- **Utilização de API Externa**: A integração com a API OMDB é feita para buscar informações sobre filmes, demonstrando o uso de serviços externos.
- **Persistência de Dados**: A lista de títulos é persistida em um arquivo JSON utilizando a biblioteca Gson, demonstrando técnicas de persistência de dados.


# Desenvolvedor

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/134724019?v=4" width=115><br><sub>Ronaldo Navarro</sub>](https://github.com/ronaldosnavarro)