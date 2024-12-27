public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;// saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        if (destino == this) {
            System.out.println("Conta de origem e destino são iguais");
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência");
            return;
        }
        if (destino == null) {
            System.out.println("Conta de destino não encontrada");
            return;
        }
        if (destino.getCliente() == null) {
            System.out.println("Cliente de destino não encontrado");
            return;
        }
        saldo -= valor;
        destino.depositar(valor);
    }

    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }
}
