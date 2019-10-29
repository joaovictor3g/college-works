import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;


public class Endereco implements Comparable <Cliente>{
    private String nome;
    private int codigo_academia;
    private String rua;
    private List<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario_CAIXA> caixa = new ArrayList<>();
    private ArrayList<Gerente> gerente = new ArrayList<>();
    private ArrayList<Fun_Instrutor> instrutor = new ArrayList<>();
    private ArrayList<Fun_Limpeza> limpeza = new ArrayList<>();
    private int codigoFunCaixa = 0;
    private int codigoCliente = 0;
    private int codigoInstrutor = 0;
    private int codigoLimpeza = 0;
    private int codigoGerente = 0;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome_){
        this.nome = nome_;

    }
    public int getCodigoAcademia(){
        return this.codigo_academia;

    }
    public void setCodigoAcademia(int codigo_){
        this.codigo_academia = codigo_;
    }
    public void setRua(String rua_){
        this.rua = rua_;

    }
    public String getRua(){
        return this.rua;

    }
    //Método sobrescrita para interface Comparable
    @Override
    public int compareTo(Cliente codigo) {
        if(this.codigoCliente < codigo.getCodigo())
            return -1;
        if(this.codigoCliente > codigo.getCodigo())
            return 1;
        return 0;
    }
    public void adicionarCliente(String nome_, String cpf_, int matricula){
        clientes.add(new Cliente(nome_, cpf_, matricula));
            
    }
    public void adicionarGerente(String nome_gerente, String cpf_gerente, int codigo_gerente){
        codigoGerente++;
        gerente.add(new Gerente(nome_gerente, cpf_gerente, codigoGerente));
    }
    public void adicionarCaixa(String nomeCaixa, String cpfCaixa, int codigoCaixa){
        codigoFunCaixa++;
        caixa.add(new Funcionario_CAIXA(nomeCaixa, cpfCaixa, codigoFunCaixa));
        

    }
    public void adicionarInstrutor(String nomeInstrutor, String cpfInstrutor, int codigo){
        codigoInstrutor++;
        instrutor.add(new Fun_Instrutor(nomeInstrutor, cpfInstrutor, codigoInstrutor));

    }
    public void adicionarLimpeza(String nomeLimpeza, String cpfLimpeza, int codigoLim){
        codigoLimpeza++;
        limpeza.add(new Fun_Limpeza(nomeLimpeza, cpfLimpeza, codigoLimpeza));

    }
    public boolean searchByCode(int matricula_){ 
        for(Cliente clie : clientes){
            if(clie.getCodigo() == matricula_){
                System.out.println("Nome: "+clie.getNome() +" Matrícula: "+ clie.getCodigo());
                return true;
            }
        }
        return false;
    }
    public void mostrarCliente(){
        for(Cliente cli: clientes){
            System.out.println(cli);
        }
    }
    public boolean mostrarGerente(){
        for(Gerente ger: gerente)
            System.out.println(ger);
        return false;
    }
    public boolean mostrarCaixa(){
        for(Funcionario_CAIXA funcc: caixa)
            System.out.println(funcc);
        return false;
    }
    public void mostrarInstrutor(){
        for(Fun_Instrutor ins: instrutor)
            System.out.println(ins);
            
    }
    public boolean mostrarLimpeza(){
        for(Fun_Limpeza lim: limpeza)
            System.out.println(lim);
        return false;
    }
}