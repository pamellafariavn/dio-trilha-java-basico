public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    // construtor
    public Cliente(int id, String nome, String cpf, String endereco, String telefone, String email) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() { // ler atributo privado
        return id;
    }

    public String getNome() { // ler atributo privado
        return nome;
    }

    public void setNome(String nome) { // alterar atributo privado
        this.nome = nome;
    }

    public String getCpf() { // ler atributo privado
        return cpf;
    }

    public String getEndereco() { // ler atributo privado
        return endereco;
    }

    public void setEndereco(String endereco) { // alterar atributo privado
        this.endereco = endereco;
    }

    public String getTelefone() { // ler atributo privado
        return telefone;
    }

    public void setTelefone(String telefone) { // alterar atributo privado
        this.telefone = telefone;
    }

    public String getEmail() { // ler atributo privado
        return email;
    }

    public void setEmail(String email) { // alterar atributo privado
        this.email = email;
    }

    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone
                + ", email=" + email + "]";
    }

}