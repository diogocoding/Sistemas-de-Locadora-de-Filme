package main;

// Importa as classes do pacote 'model'
import br.com.locadora.model.Cliente;
import br.com.locadora.model.Conta;
import br.com.locadora.model.Filme;

// Classe principal para executar o programa
public class Main {

    public static void main(String[] args) {

        System.out.println("====== SISTEMA DE LOCADORA DE FILMES ======");

        // --- 1. Criando os 10 Filmes ---
        Filme f1 = new Filme("Salt", 2012, "Ação", 3.50);
        Filme f2 = new Filme("X-Men First Class", 2011, "Ação/Ficção", 5.00);
        Filme f3 = new Filme("Heroes", 2008, "Ficção", 3.50);
        Filme f4 = new Filme("O Poderoso Chefão", 1972, "Drama", 7.00);
        Filme f5 = new Filme("Interestelar", 2014, "Ficção", 6.50);
        Filme f6 = new Filme("A Origem", 2010, "Ficção", 6.00);
        Filme f7 = new Filme("Matrix", 1999, "Ficção", 5.50);
        Filme f8 = new Filme("O Senhor dos Anéis", 2001, "Fantasia", 7.00);
        Filme f9 = new Filme("O Exterminador do Futuro 2", 1991, "Ação", 4.00);
        Filme f10 = new Filme("De Volta para o Futuro", 1985, "Comédia/Ficção", 4.50);

        // --- 2. Criando 3 Clientes e suas Contas ---

        // Cliente 1
        Cliente c1 = new Cliente("Diogo Nascimento", "111.111.111-11", "Rua A, 10", "81-9999-0001");
        Conta conta1 = new Conta(c1, 1001); // Associa o cliente c1 à conta1

        // Cliente 2
        Cliente c2 = new Cliente("Maria Silva", "222.222.222-22", "Rua B, 20", "81-9999-0002");
        Conta conta2 = new Conta(c2, 1002);

        // Cliente 3
        Cliente c3 = new Cliente("João Souza", "333.333.333-33", "Rua C, 30", "81-9999-0003");
        Conta conta3 = new Conta(c3, 1003);

        // --- 3. Criando as Locações ---
        System.out.println("\nRegistrando locações...");

        // Locações do Cliente 1
        Filme[] filmesLocacao1 = new Filme[10];
        filmesLocacao1[0] = f1; // Salt
        filmesLocacao1[1] = f3; // Heroes
        conta1.locarFilmes(filmesLocacao1); // Chama o método para registrar

        Filme[] filmesLocacao2 = new Filme[10];
        filmesLocacao2[0] = f2; // X-Men
        conta1.locarFilmes(filmesLocacao2);

        // Locações do Cliente 2
        Filme[] filmesLocacao3 = new Filme[10];
        filmesLocacao3[0] = f4; // Poderoso Chefão
        filmesLocacao3[1] = f5; // Interestelar
        filmesLocacao3[2] = f6; // A Origem
        conta2.locarFilmes(filmesLocacao3);

        Filme[] filmesLocacao4 = new Filme[10];
        filmesLocacao4[0] = f7; // Matrix
        conta2.locarFilmes(filmesLocacao4);

        // Locações do Cliente 3
        Filme[] filmesLocacao5 = new Filme[10];
        filmesLocacao5[0] = f6;
        filmesLocacao5[1] = f7;
        filmesLocacao5[2] = f8;
        filmesLocacao5[3] = f9;
        filmesLocacao5[4] = f10;
        conta3.locarFilmes(filmesLocacao5);

        // Cliente 3 pagando uma parte
        System.out.println(c3.getNome() + " está pagando R$ 10.00...");
        conta3.pagarDebito(10.00);

        // --- 4. Imprimindo os Extratos ---
        System.out.println("\n====== IMPRIMINDO EXTRATOS ======");
        System.out.println("===============================================================================================");
        System.out.println(conta1.extratoHistorico()); // Chama o método que gera o extrato
        System.out.println("===============================================================================================");
        System.out.println(conta2.extratoHistorico());
        System.out.println("===============================================================================================");
        System.out.println(conta3.extratoHistorico());
        System.out.println("===============================================================================================");
    }
}