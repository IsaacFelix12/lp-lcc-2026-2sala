package biblioteca.isaacFelix;

public class Tela {

//para por na classe Main que é onde todo o programa vai rodar

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        CadastrarLivro cadastro = new CadastrarLivro(biblioteca);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MINHA BIBLIOTECA ---");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros cadastrados");
            System.out.println("3 - Buscar livro por título");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(leitor.nextLine());

            if (opcao == 1) {
                cadastro.cadastrar(leitor);
            } else if (opcao == 2) {
                List<Livro> lista = biblioteca.listarTodos();
                if (lista.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    for (Livro l : lista) {
                        System.out.println(l);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Título: ");
                String titulo = leitor.nextLine();
                List<Livro> achados = biblioteca.buscaPorTitulo(titulo);
                if (achados.isEmpty()) {
                    System.out.println("Livro não encontrado.");
                } else {
                    for (Livro l : achados) {
                        System.out.println(l);
                    }
                }
            }
        }

        leitor.close();
    }
}

//parou aqui
}
