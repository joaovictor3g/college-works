import java.util.ArrayList;

class Fun_Instrutor extends Funcionario{
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private int codigo = 0;
    
    public Fun_Instrutor(String nome, String cpf, int codigo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setCodigo(codigo);

    }
    public Fun_Instrutor(){
       
    }
    @Override
    public double getSalario() {
        return 900;
    }
}