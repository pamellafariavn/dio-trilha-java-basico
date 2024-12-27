import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco(new ArrayList<Conta>(), new ArrayList<Cliente>());
        int opcao = 0;
        while (opcao != 7) {

            System.out.println("Bem Vindo ao Banco:");
            System.out.println(" Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Consultar Cliente");
            System.out.println("7 - Sair");

            opcao = scanner.nextInt();
            scanner.hasNextLine();

            switch (opcao) {
                case 1:
                    System.out.println("1 - Cadastrar Cliente");
                    System.out.println("Digite o id do cliente:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cpf do cliente:");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o endereço do cliente:");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o telefone do cliente:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o email do cliente:");
                    String email = scanner.nextLine();
                    Cliente cliente = new Cliente(id, nome, cpf, endereco, telefone, email);
                    banco.addCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");

                    break;

                case 2:
                    System.out.println("2 - Cadastrar Conta");
                    System.out.println("Digite o número da conta:");
                    int numeroConta = scanner.nextInt(); // nome diferente para o número da conta
                    scanner.nextLine();
                    System.out.println("Digite o saldo da conta:");
                    double saldoConta = scanner.nextDouble(); // nome diferente para o saldo
                    scanner.nextLine();
                    System.out.println("Digite o id do cliente:");
                    int idCliente = scanner.nextInt();
                    Cliente clienteEncontrado = banco.getCliente(idCliente);
                    if (clienteEncontrado != null) {
                        System.out.println("CLIENTE ENCONTRADO: id " + clienteEncontrado.getId() + " nome: "
                                + clienteEncontrado.getNome());

                        Conta conta = new Conta(numeroConta, saldoConta, clienteEncontrado);
                        banco.addConta(conta);
                        System.out.println("Conta cadastrada com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado com o ID:" + idCliente);
                    }
                    break;

                case 3:
                    System.out.println("3 - Depositar");
                    System.out.println("Digite o número da conta:");
                    int numeroDeposito = scanner.nextInt(); // nome diferente para o número da conta no depósito
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble(); // nome diferente para o valor do depósito
                    banco.depositar(numeroDeposito, valorDeposito);
                    break;

                case 4:
                    System.out.println("4 - Sacar");
                    System.out.println("Digite o número da conta:");
                    int numeroSaque = scanner.nextInt(); // nome diferente para o número da conta no saque
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble(); // nome diferente para o valor do saque
                    banco.sacar(numeroSaque, valorSaque);
                    break;

                case 5:
                    System.out.println("5 - Transferir");
                    System.out.println("Digite o número da conta de origem:");
                    int numeroOrigem = scanner.nextInt();
                    System.out.println("Digite o número da conta de destino:");
                    int numeroDestino = scanner.nextInt();
                    System.out.println("Digite o valor da transferência:");
                    double valorTransferencia = scanner.nextDouble(); // nome diferente para o valor da transferência
                    banco.transferir(numeroOrigem, numeroDestino, valorTransferencia);
                    break;

                case 6:
                    System.out.println("6 - Consultar Saldo");
                    System.out.println("Digite o número da conta:");
                    int numeroConsulta = scanner.nextInt(); // nome diferente para o número da conta na consulta
                    Conta contaConsulta = banco.getConta(numeroConsulta);
                    System.out.println("Saldo: " + contaConsulta.getSaldo());
                    break;

                case 7:
                    System.out.println("7 - Sair");
                    System.out.println("Obrigado por utilizar o Banco!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
