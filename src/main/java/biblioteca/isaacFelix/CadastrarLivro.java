package biblioteca.isaacFelix;

import java.util.Scanner;

public class CadastrarLivro {
    private Biblioteca biblioteca;

    public CadastrarLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void Cadastrar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("---Cadastro de livro---");

        System.out.println("titulo: ");
        String titulo = leitor.nextLine();

        System.out.println("Autor: ");
        String autor = leitor.nextLine();

        System.out.println("Ano Lido: ");
        int ano = Integer.parseInt(leitor.nextLine());

        Livro novoLivro = new Livro(titulo,autor,ano);
        biblioteca.cadastrarLivro(novoLivro);

        System.out.println("Livro Cadastrado");

        leitor.close();
    }
}
