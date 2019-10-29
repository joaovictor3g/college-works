import java.util.Scanner;

public class Cadastro_Cliente{
    Endereco endereco = new Endereco();
    Planos planoA = new PlanoA();
    Planos planoB = new PlanoB();
    Planos planoC = new PlanoC();
    Cliente cliente = new Cliente();
    Pagamento boleto = new Boleto();
    Pagamento credito = new Credito();

    Scanner input = new Scanner(System.in);

    private int mes_ultimo_pagamento;

    public void escolhaDePlanosEFormaDePagamento(){
        System.out.println("Escolha o plano");
        System.out.println("1-Plano A");
        System.out.println("2-Plano B");
        System.out.println("3-Plano C");
        int escolha = input.nextInt();

        System.out.println("Forma de Pagamento:\n1-Crédito\n2-Débito");
        int forma_de_pagamento = input.nextInt();

        if(escolha == 1 && forma_de_pagamento == 1){
            planoA.escolhaPlano();
            credito.pagamento();

        }else if(escolha == 1 && forma_de_pagamento == 2){
            planoA.escolhaPlano();
            boleto.pagamento();

        }else if(escolha == 2 && forma_de_pagamento == 1){
            planoB.escolhaPlano();
            credito.pagamento();
        
        }else if(escolha == 2 && forma_de_pagamento == 2){
            planoB.escolhaPlano();
            boleto.pagamento();

        }else if(escolha == 3 && forma_de_pagamento == 1){
            planoC.escolhaPlano();
            credito.pagamento();

        }else if(escolha == 3 && forma_de_pagamento == 2){
            planoC.escolhaPlano();
            boleto.pagamento();
            
        }   
    }
    public double valor(){
        return 40;
    }

}