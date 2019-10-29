


class Fun_Limpeza extends Funcionario{
    public Fun_Limpeza(String nome, String cpf, int codigo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setCodigo(codigo); 
    }
    @Override
    public double getSalario() {
        return 900;
    }
    
}