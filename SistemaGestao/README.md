# Sistema de Gestão de Pedidos

Sistema console em Java para gerenciar clientes, produtos e pedidos com processamento assíncrono e persistência em JSON.

## Tecnologias

- Java 11+
- Gson 2.10.1

## Como Compilar e Executar

### Compilar
```bash
javac -cp "lib/gson-2.10.1.jar" -d out Main.java menu/*.java modelo/*.java repositorio/*.java servico/*.java enums/*.java excecoes/*.java dados/*.java
```

### Executar
```bash
java -cp "out;lib/gson-2.10.1.jar" Main
```

**Nota:** No Linux/Mac, use `:` em vez de `;` no classpath: `"out:lib/gson-2.10.1.jar"`

## Estrutura do Projeto

```
SistemaGestao/
├── modelo/              # Classes de domínio
│   ├── Cliente.java
│   ├── Produto.java
│   ├── ItemPedido.java
│   └── Pedido.java
├── enums/               # Enumerações
│   ├── CategoriaProduto.java
│   └── StatusPedido.java
├── excecoes/            # Exceções customizadas
│   ├── DadosInvalidosException.java
│   ├── EmailInvalidoException.java
│   └── PrecoInvalidoException.java
├── repositorio/         # Persistência
│   ├── Repositorio.java (interface)
│   ├── RepositorioBase.java (classe abstrata)
│   ├── ClienteRepositorio.java
│   ├── ProdutoRepositorio.java
│   └── PedidoRepositorio.java
├── dados/               # Persistência em JSON (BÔNUS)
│   ├── JsonDatabase.java
│   ├── Cliente.json
│   ├── Produto.json
│   └── Pedido.json
├── servico/             # Lógica de negócio
│   └── ProcessadorPedidos.java
├── menu/                # Interface console
│   └── MenuPrincipal.java
├── lib/                 # Bibliotecas externas
│   └── gson-2.10.1.jar
├── out/                 # Arquivos compilados
└── Main.java            # Entrada do sistema
```

## Aplicação dos Fundamentos de POO

### Encapsulamento
- **Cliente.java:35**: Atributos private com validação via setter
- **Produto.java:35**: Validação de preço positivo
- **Pedido.java:29**: Lista de itens protegida, retorna cópia

### Herança
- **EmailInvalidoException** extends **DadosInvalidosException**
- **PrecoInvalidoException** extends **DadosInvalidosException**
- **ClienteRepositorio** extends **RepositorioBase<Cliente>**
- **ProdutoRepositorio** extends **RepositorioBase<Produto>**
- **PedidoRepositorio** extends **RepositorioBase<Pedido>**

### Polimorfismo
- **ProcessadorPedidos** implements **Runnable**: permite execução como thread
- Tratamento polimórfico de exceções (DadosInvalidosException)
- Repositórios implementam **Repositorio<T>**: polimorfismo através de interface genérica

### Interfaces
- **Repositorio<T>**: Interface genérica para operações CRUD
- **Runnable**: Interface para processamento assíncrono
- 3 repositórios implementam Repositorio<T> com tipos específicos

### Classes Abstratas
- **RepositorioBase<T>**: Classe abstrata que implementa Repositorio<T>
- Fornece implementação comum (adicionar, listarTodos, gerarProximoId)
- Declara métodos abstratos: buscarPorId() e getFileName()
- 3 repositórios concretos herdam de RepositorioBase<T>
- Implementa métodos de persistência: salvar() e carregarLista()

### Composição
- **Pedido** contém **Cliente** e lista de **ItemPedido**
- **ItemPedido** contém **Produto**

### Enums
- **CategoriaProduto**: ALIMENTOS, ELETRONICOS, LIVROS
- **StatusPedido**: ABERTO, FILA, PROCESSANDO, FINALIZADO

## Princípios SOLID Aplicados

### Single Responsibility Principle (SRP)
- **ClienteRepositorio**: apenas gerencia clientes
- **ProcessadorPedidos**: apenas processa pedidos em fila
- **MenuPrincipal**: apenas interface com usuário

### Open/Closed Principle (OCP)
- Enums permitem adicionar novas categorias sem modificar Produto
- Exceções customizadas podem ser estendidas sem modificar hierarquia

### Liskov Substitution Principle (LSP)
- **EmailInvalidoException** e **PrecoInvalidoException** podem substituir **DadosInvalidosException**

### Interface Segregation Principle (ISP)
- **Runnable** interface focada: apenas método run()

### Dependency Inversion Principle (DIP)
- **MenuPrincipal** depende de repositórios, não de implementações específicas de armazenamento

## Object Calisthenics Aplicados

### 1. Métodos Pequenos
- **ItemPedido.calcularSubtotal()**: 1 linha
- **Pedido.adicionarItem()**: 1 linha
- **ProcessadorPedidos.obterProximoPedido()**: 1 linha

### 2. Classes com Propósito Único
- **ItemPedido**: representa apenas item do pedido
- **ProcessadorPedidos**: apenas processa fila

### 3. Evitar Getters/Setters Triviais
- **Cliente.setEmail()**: validação obrigatória
- **Produto.setPreco()**: validação obrigatória
- Getters retornam cópias quando necessário (Pedido.getItens())

### 4. Sem Abreviações
- Nomes completos: calcularSubtotal, adicionarNaFila, obterProximoPedido

## Tratamento de Concorrência

### Sincronização de Thread
**ProcessadorPedidos.java:19** - Método `adicionarNaFila()` sincronizado para evitar condição de corrida

**ProcessadorPedidos.java:33** - Método `obterProximoPedido()` sincronizado para acesso thread-safe à fila

### Estrutura Thread-Safe
- Uso de `LinkedList` como fila com métodos sincronizados
- Thread separada executa processamento em background
- Menu continua responsivo durante processamento

### Fluxo de Processamento
1. Pedido criado com status ABERTO
2. Adicionado na fila com status FILA (sincronizado)
3. Thread consome da fila (sincronizado)
4. Status muda para PROCESSANDO
5. Simula processamento (3 segundos)
6. Status final: FINALIZADO

## Validações e Exceções

### EmailInvalidoException
Lançada quando email vazio ou null (Cliente.java:29)

### PrecoInvalidoException
Lançada quando preço <= 0 (Produto.java:31)

### DadosInvalidosException
Exceção base para validações de dados

## Funcionalidades Implementadas

### Obrigatórias
- Cadastro de clientes com validação de email
- Cadastro de produtos com categoria (ENUM) e validação de preço
- Criação de pedidos com múltiplos itens
- Cálculo automático do valor total
- Status de pedido com ENUM
- Processamento assíncrono com thread separada
- Sincronização para evitar concorrência
- Menu responsivo durante processamento
- Listagem de clientes, produtos e pedidos

### Tratamento de Exceções
- Exceções customizadas com hierarquia
- Validação de entrada
- Try-catch em operações críticas

### Bônus - Persistência em JSON
- Salvamento e carregamento em arquivos JSON
- Biblioteca Gson 2.10.1
- Arquivos: dados/Cliente.json, dados/Produto.json, dados/Pedido.json

## Integrantes

Eduardo Sochodolak, Johann Matheus Pedroso da Silva e Alexsandro Lemos
