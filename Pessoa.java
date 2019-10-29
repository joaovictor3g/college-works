


public abstract class Pessoa{
    public Endereco endereco = new Endereco();
    private String nome;
    private String cpf;
    private int codigo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Cpf: " + this.cpf + " Codigo: " + this.codigo;
    }
}