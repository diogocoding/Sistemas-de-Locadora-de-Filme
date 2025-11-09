# Sistemas de Locadora de Filme

Este projeto é um exercício acadêmico da disciplina de Arquitetura e Desenvolvimento Backend, focado nos conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

O objetivo foi construir um sistema simples em Java para gerenciar as locações de filmes de clientes, calculando seus débitos e mantendo um histórico de locações.

---

## 🏛️ Diagrama do Sistema


```mermaid
classDiagram
    direction LR

    class Conta {
        -Cliente cliente
        -int numero
        -double saldoDevedor
        -Locacao[] historicoLocacao
        +Conta()
        +Conta(Cliente, int)
        +locarFilmes(Filme[]) void
        +pagarDebito(double) void
        +extratoHistorico() String
    }

    class Cliente {
        -String nome
        -String cpf
        -String endereco
        -String telefone
        +Cliente()
        +Cliente(String, String, String, String)
    }

    class Locacao {
        -Date data
        -double valorTotalAPagar
        -Filme[] listaFilmes
        +Locacao()
        +Locacao(Date)
        +addFilme(Filme) void
    }

    class Filme {
        -String titulo
        -int ano
        -String genero
        -double valorLocacao
        +Filme()
        +Filme(String, int, String, double)
    }

    %% --- Relacionamentos ---
    %% Uma Conta "tem um" Cliente
    Conta --> "1" Cliente

    %% Uma Conta "tem várias" Locações (até 20)
    Conta --> "0..20" Locacao

    %% Uma Locação "tem vários" Filmes (até 10)
    Locacao --> "0..10" Filme
````

---

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE:** IntelliJ IDEA Ultimate
* **Controle de Versão:** Git & GitHub

---

## 🏗️ Estrutura do Projeto

O código-fonte (`src`) foi organizado nos seguintes pacotes, conforme solicitado:

* `br.com.locadora.model`
    * Contém as classes de entidade que representam o núcleo do sistema, baseadas no diagrama UML fornecido:
    * **Filme.java**: Molde para os objetos de filme (título, ano, valor, etc.).
    * **Cliente.java**: Molde para os clientes da locadora.
    * **Locacao.java**: Classe que representa um aluguel, contendo uma data e uma lista de filmes.
    * **Conta.java**: Classe central que "amarra" um `Cliente` ao seu `historicoLocacao` e `saldoDevedor`.

* `br.com.locadora.main`
    * **Main.java**: Classe principal utilizada para executar o sistema. Ela instancia os objetos, simula as locações e imprime os extratos no console.

---

## ▶️ Como Executar

1.  Clone este repositório.
2.  Abra o projeto no IntelliJ IDEA (ou outra IDE Java).
3.  Localize o arquivo `src/br/com/locadora/main/Main.java`.
4.  Clique com o botão direito sobre ele e selecione **"Run 'Main.main()'"**.
5.  O extrato de todos os clientes será impresso no console de saída.
