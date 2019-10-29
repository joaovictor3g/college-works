import java.util.Scanner;   
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class Menu{
	//private Pessoa cliente = new Cliente();
    Cadastro_Cliente Clicad = new Cadastro_Cliente();
    private Endereco end = new Endereco();
    private Pessoa gerente = new Gerente();
    private Pessoa funC = new Funcionario_CAIXA();
    private Pessoa funI = new Fun_Instrutor();
    private Cliente clientes1 = new Cliente();
    private ArrayList<Maquinas_Musculacao> maquinas = new ArrayList<>();
    

    //private Planos planos = new Planos();
    Date data = new Date();
    Scanner input = new Scanner(System.in);

    private int senha = 1234;
    private int cadastrado = 0;
    //Menu de interação com o usuário
    public void menuEscolha(){
        System.out.println("Deseja cadastrar:\n-------------------------------------------\n1-Novo Cliente\n2-Novo Funcionário\n3-Mostrar registros dos clientes e funcionários\n4-Cliente já tem cadastro?\n5-Adicionar máquinas de musculação");
        cadastrado = input.nextInt();
        testeMenu();
    }
    public void testeMenu(){
        if(cadastrado != 1 && cadastrado != 2 && cadastrado != 3 && cadastrado != 4 && cadastrado != 5){
            System.out.println("Entrada inválida tente novamente");
            menuEscolha();
        }
        else if(cadastrado == 1)    cadastroCliente();

        else if(cadastrado == 2)    cadastroFuncionarios();
        
        else if(cadastrado == 3)    visualizarCadastros();

        else if(cadastrado == 4)    jaCadastrado();

        else if(cadastrado == 5)    AdicionarMaquinas();

    }
    public int gerarMatriculaAleatoria(){
        Random gerador = new Random();
        int aleatorio = 0;
        for(int i = 0; i < 1; i ++){
            aleatorio = gerador.nextInt(1000);
        }
        return aleatorio;
    }
    //Cadatro de novos clientes
    public boolean cadastroCliente(){
        while(cadastrado == 1){
            System.out.println("Digite o nome do novo cliente ");
            String nome_cliente = input.next();
            System.out.println("Digite o cpf do novo cliente ");
            String cpf_cliente = input.next();
            //System.out.println("Digite a data de nascimento do novo cliente ");
            //int data_nasc = input.nextInt();
            //cadastrarPagamento();
            Clicad.escolhaDePlanosEFormaDePagamento();
            end.adicionarCliente(nome_cliente, cpf_cliente, gerarMatriculaAleatoria());
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais clientes.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                cadastrado = 1;
        }
        return false;
    }
    private int novo_funcionario = 0;

    public void cadastroFuncionarios(){
        while(cadastrado == 2){
            System.out.println("Cadastrar novo:\n1-Gerente   2-Caixa\n3-Instrutor    4-Limpeza");
            novo_funcionario = input.nextInt();
            break;
        }
        if(novo_funcionario == 1) cadastroGerente();

        else if(novo_funcionario == 2)  cadastroCaixa();

        else if(novo_funcionario == 3)  cadastroInstrutor();

        else if(novo_funcionario == 4)  cadastroZelador();
    }
    //cadastro de novos funcionários
    public boolean cadastroGerente(){
        while(novo_funcionario == 1){
            System.out.println("Digite o nome do novo Gerente ");
            String nome_gerente = input.next();
            System.out.println("Digite o cpf do novo Gerente ");
            String cpf_gerente = input.next();
            int codigo_gerente = gerente.getCodigo();
            end.adicionarGerente(nome_gerente, cpf_gerente, codigo_gerente);
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais gerentes.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                novo_funcionario = 1;
        }
        return false;
    }
    //Cadastro de novos caixas
    public boolean cadastroCaixa(){
        while(novo_funcionario == 2){
            System.out.println("Digite o nome do novo caixa ");
            String nome_caixa = input.next();
            System.out.println("Digite o cpf do novo caixa ");
            String cpf_caixa = input.next();
            int codigo_caixa = funC.getCodigo();
            end.adicionarCaixa(nome_caixa, cpf_caixa, codigo_caixa);
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais Caixas.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                novo_funcionario = 2;
        }
        return false;
    }
    //Cadastro de novos Instrutores
    public boolean cadastroInstrutor(){
        while(novo_funcionario == 3){
            System.out.println("Digite o nome do novo Instrutor ");
            String nome_instrutor = input.next();
            System.out.println("Digite o cpf do novo Instrutor ");
            String cpf_instrutor = input.next();
            int codigo_instrutor = funI.getCodigo();
            end.adicionarInstrutor(nome_instrutor, cpf_instrutor, codigo_instrutor);
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais instrutores.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                novo_funcionario = 3;
        }
        return false;
    }
    //Cadastro de novos Funcionarios da limpeza
    public boolean cadastroZelador(){
        while(novo_funcionario == 4){
            System.out.println("Digite o nome do novo zelador ");
            String nome_zelador= input.next();
            System.out.println("Digite o cpf do novo zelador ");
            String cpf_zelador = input.next();
            int codigo_zelador = funI.getCodigo() + 1;
            end.adicionarLimpeza(nome_zelador, cpf_zelador, codigo_zelador);
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais zeladores.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                novo_funcionario = 4;
        }
        return false;
    }
    //Mostrar todos os clientes e funcionarios, requer senha de acesso - 1234
    public boolean visualizarCadastros(){
        while(cadastrado == 3){
            System.out.println("Digite a senha de acesso");
            int senha_acesso = input.nextInt();

            if(autentica(senha_acesso)){
                System.out.println("Acesso autorizado");
                System.out.println("Acessar informações: 1-Clientes     2-Funcionários ");
                int acesso = input.nextInt();

                if(acesso == 1){
                    end.mostrarCliente();
                    System.out.println("1-Voltar ao menu    2-Ver outros cadastros");
                    int voltar = input.nextInt();
                    
                    if(voltar == 1)
                        menuEscolha();

                    else if(voltar == 2){
                       senha_acesso = this.senha;
                       autentica(senha_acesso);
                    }

                }else{
                    System.out.println("1-Gerentes  2-Caixas\n3-Instrutores  4-Limpeza");
                    int acesso_func = input.nextInt();
                    if(acesso_func == 1){
                        end.mostrarGerente();
                        System.out.println("1-Retornar ao menu");
                        int retorno_menu = input.nextInt();
                        if(retorno_menu == 1)
                            menuEscolha();
                    
                    }else if(acesso_func == 2){
                        end.mostrarCaixa();
                        System.out.println("1-Retornar ao menu");
                        int retorno_menu2 = input.nextInt();
                        if(retorno_menu2 == 1)
                            menuEscolha();

                        
                    }else if(acesso_func == 3){
                        end.mostrarInstrutor();
                        System.out.println("1-Retornar ao menu");
                        int retorno_menu3 = input.nextInt();
                        if(retorno_menu3 == 1)
                            menuEscolha();

                    }else if(acesso_func == 4){
                        end.mostrarLimpeza();
                        System.out.println("1-Retornar ao menu");
                        int retorno_menu4 = input.nextInt();
                        if(retorno_menu4 == 1)
                            menuEscolha();
                    }
                }

            }else{
                System.out.println("ACESSO NEGADO!!!\n1-Retornar ao menu\n2-Tentar Novamente");
                int retornaMenu = input.nextInt();
                if(retornaMenu == 1)    
                    menuEscolha();

                else    
                    visualizarCadastros();
            }
        }
        return false;
    }
    //Busca aluno por matrícula
    public boolean jaCadastrado(){
        int matricula = 0;
        while(cadastrado == 4){
            System.out.println("Digite a matrícula do aluno");
            matricula = input.nextInt();

            if(!end.searchByCode(matricula)){
                System.out.println("Aluno inexistente, 0 para tentar NOVAMENTE ou digite  1 para voltar ao menu");
                int voltarAoMenu = input.nextInt();
                if(voltarAoMenu == 1)
                    menuEscolha();
                else 
                    jaCadastrado();
                
            }else{
                end.searchByCode(matricula);
                System.out.println("_");
                System.out.println("1-Retornar ao menu");
                int retorno_ao_menu = input.nextInt();
                if(retorno_ao_menu == 1)
                    menuEscolha();
            }

        }
        return false;
    }
    //Metodo para verificar o dia da semana e definir oq vai ser malhado no dia
    /*public int diaDaSemana(){
        int semana = 0;
        System.out.println("Qual o dia da semana?");
        System.out.println("1-Segunda\n2-Terça\n3-Quarta\n4-Quinta\n5-Sexta\n6-Sábado");
        semana = input.nextInt();

        return semana;
    }*/
    //Metodo que verifica a senha
    protected boolean autentica(int senha_){
        if(this.senha == senha_)
            return true;
        return false;
    } 
    
    private int id_maquinas = 0;
    //Adicionar novas máquinas
    public void AdicionarMaquinas(){
        while(cadastrado == 5){
            System.out.println("Digite o nome da nova máquina");
            String nome_maquina = input.next();
            id_maquinas++;
            maquinas.add(new Maquinas_Musculacao(nome_maquina, id_maquinas));
            System.out.println("Digite 1 para continuar cadastrando ou 2 para voltar ao menu");
            int voltar = input.nextInt();

            if(voltar == 1)
                cadastrado = 5;
            else 
                menuEscolha();
        }

    }
    /*public boolean cadastrarPagamento(){
        //int codigo_cliente = cliente.getCodigo();
        System.out.println("Planos:\n1-Plano 1 2-Plano 2 3-Plano 3");
        int plano = input.nextInt();
        if(plano == 1)      planos.Plano1();

        else if(plano == 2)     planos.Plano2();

        else if(plano == 3)     planos.Plano3();

        return false;
    }*/

}