


public abstract class Funcionario extends Pessoa{
    protected double salario;
    public abstract double getSalario();

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Salário: " + this.getSalario() + " Código: "+ this.getCodigo();
    }
} 