


class Gerente extends Funcionario{
   
    public Gerente(String nome_, String cpf_, int codigo_){
        this.setNome(nome_);
        this.setCpf(cpf_);
        this.setCodigo(codigo_);
    }
    public Gerente(){

    }
    @Override
    public double getSalario() {
        return 1200;
    }
    
}   