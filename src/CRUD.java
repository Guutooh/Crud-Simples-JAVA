import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrar() {

        Scanner input = new Scanner(System.in);

        System.out.print("Nome da pessoa a ser cadastrada: ");
        String nome = input.nextLine();

        System.out.print("Digite o RG: ");
        int rg = input.nextInt();

        System.out.print("Infome a idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Informe endereço completo: ");
        String endereco = input.nextLine();

        Pessoa cadastro = new Pessoa(nome, rg, idade, endereco);

        pessoas.add(cadastro);

        System.out.println("\n");
    }

    public void atualizarCadastro() {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o RG da pessoa a ser atualizada:");
        int rg = input.nextInt();
        input.nextLine();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                System.out.print("Informe o novo nome: ");
                String nome = input.nextLine();
                pessoa.setNome(nome);

                System.out.print("Informe a nova idade: ");
                int idade = input.nextInt();
                input.nextLine();
                pessoa.setIdade(idade);

                System.out.print("Informe o novo endereco: ");
                String endereco = input.nextLine();
                pessoa.setEndereco(endereco);

                System.out.print("Pessoa atualizada com sucesso!");
                System.out.println("\n");
                return;

            }

        }
        System.out.println("Pessoa não encontrada.");
        System.out.println("\n");
    }

    public void lerPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o RG da pessoa a ser lida:");
        int rg = input.nextInt();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.print("Endereco: " + pessoa.getEndereco());
                System.out.println("\n");
                return;
            }

        }
        System.out.println("Pessoa não encontrada.");
        System.out.println("\n");
    }

    public void excluir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ID da pessoa a ser excluida:");
        int rg = scanner.nextInt();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                pessoas.remove(pessoa);
                System.out.print("Pessoa excluida com sucesso!");
                System.out.println("\n");
                return;
            }

        }
        System.out.println("Pessoa não encontrada.");
        System.out.println("\n");

    }



}
