


class Funcionario_CAIXA extends Funcionario{
   
    public Funcionario_CAIXA(String nome, String cpf, int codigo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setCodigo(codigo);
    }
    public Funcionario_CAIXA(){

    }
    @Override
    public double getSalario() {
        return 900;
    }
    
}