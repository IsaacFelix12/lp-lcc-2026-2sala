package biblioteca.isaacFelix;

import java.util.Scanner;

public class CadastrarLivro {
    private Biblioteca biblioteca;

    public CadastrarLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void cadastrar(Scanner leitor) {
        System.out.println("--- Cadastro de livro ---");
        System.out.print("Título: ");
        String titulo = leitor.nextLine();

        System.out.print("Autor: ");
        String autor = leitor.nextLine();

        if (biblioteca.jaExiste(titulo)) {
            System.out.println("Este livro já está cadastrado!");
            return;
        }

        int ano = lerAnoValido(leitor);

        Livro novoLivro = new Livro(titulo, autor, ano);
        biblioteca.cadastrarLivro(novoLivro);
        System.out.println("Livro cadastrado!");
    }

    private int lerAnoValido(Scanner leitor) {
        while (true) {
            System.out.print("Ano Lido: ");
            try {
                return Integer.parseInt(leitor.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um ano numérico válido.");
            }
        }
    }
}
