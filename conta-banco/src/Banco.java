import java.util.ArrayList;

public class Banco {

    protected ArrayList<Conta> contas;
    protected ArrayList<Cliente> clientes;

    public Banco(ArrayList<Conta> contas, ArrayList<Cliente> clientes) {
        if (contas == null) {
            contas = new ArrayList<Conta>();
        } else {
            this.contas = contas;
        }
        if (clientes == null) {
            clientes = new ArrayList<Cliente>();
        } else {
            this.clientes = clientes;
        }
        this.contas = new ArrayList<Conta>();
        this.clientes = new ArrayList<Cliente>();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public Cliente getCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Conta getConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {
        Conta origem = getConta(numeroOrigem);
        Conta destino = getConta(numeroDestino);
        origem.transferir(destino, valor);
    }

    public void depositar(int numero, double valor) {
        Conta conta = getConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada");
        }
        conta.depositar(valor);
    }

    public void sacar(int numero, double valor) {
        Conta conta = getConta(numero);
        conta.sacar(valor);
    }

    public String toString() {
        return "Banco [contas=" + contas + ", clientes=" + clientes + "]";
    }
}
