# HANDS ON: COLLECTIONS FRAMEWORK - BOOTCAMP SANTANDER & DIO

<hr>

# List
## Operações Básicas com List

### 1. Lista de tarefas
Crie uma classe chamada `"ListaTarefas"` que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
- `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.

## Pesquisa em List

### 1. Catálago de livros

Crie uma classe chamada `"CatalogoLivros"` que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

- `adicionarLivro(String titulo, String autor, int anoPublicacao)``: Adiciona um livro ao catálogo.
- `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- `pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.


## Ordenação em List

### 1. Ordenação de Pessoas
Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.

<hr>

# Set

## Operações Básicas com Set

### 1. Conjunto de convidados
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.
contarConvidados(): Conta o número total de convidados no Set.
exibirConvidados(): Exibe todos os convidados do conjunto.


## Pesquisa com Set

### 1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adiciona um contato à agenda.
exibirContatos(): Exibe todos os contatos da agenda.
pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.

## Ordenação em Set

### 1. Cadastro de Produtos
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.

<hr>

# Map

## Operações Básicas com Map

### 1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.

## Pesquisa com Map

### 1. Estoque de Produtos

Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).

## Ordenação com Map

### 1. Agenda de Eventos

Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
obterProximoEvento(): Retorna o próximo evento que ocorrerá.
