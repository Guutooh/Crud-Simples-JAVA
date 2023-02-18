
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrar() {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o RG: ");
        int rg = input.nextInt();

        System.out.print("Infome a idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Informe endereço completo: ");
        String endereco = input.nextLine();
        System.out.println("\nCadastro Realizado com sucesso.");

        Pessoa cadastro = new Pessoa(nome, rg, idade, endereco);

        pessoas.add(cadastro);

        //System.out.println("\n");
    }

    public void atualizarCadastro() {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o RG da pessoa a ser atualizada: ");
        int rg = input.nextInt();
        input.nextLine();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                System.out.println("Informe o que deseja alterar: \n[1] - Alterar nome \n[2] - Alterar idade \n[3] - Alterar endereço");
                    int opcao = input.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.print("Informe o novo nome: ");
                        String nome = input.nextLine();
                        input.nextLine();
                        pessoa.setNome(nome);
                        System.out.println("Nome alterado com sucesso.");
                        break;

                    case 2:
                        System.out.print("Informe a nova idade: ");
                        int idade = input.nextInt();
                        input.nextLine();
                        pessoa.setIdade(idade);
                        System.out.println("Idade alterado com sucesso.");
                        break;

                    case 3:
            
                        System.out.print("Informe o novo endereco: ");
                        String endereco = input.nextLine();
                        input.nextLine();
                        pessoa.setEndereco(endereco);
                        System.out.print("Endereço atualizada com sucesso!");
                        break;

                    default:
                        System.out.println("Opção invalida!");

                }
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
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o ID da pessoa a ser excluida:");
        int rg = input.nextInt();

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

        input.close();

    }

}
