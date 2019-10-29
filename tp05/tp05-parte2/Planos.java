import java.util.Scanner;


public abstract class Planos{
    Scanner in = new Scanner(System.in);
    public double valor;

    public abstract void escolhaPlano();
    /*public boolean Plano1(){
        int verifica = 0;
        System.out.println("Como o pagamento será realizado?\n1-Boleto 2-Cartão de Crédito: ");
        verifica = in.nextInt();
        if(verifica == 1)   pag.boleto(true);

        else if(verifica == 2)  pag.credito(true);

        return false;

    }
    public boolean Plano2(){
        int verifica = 0;
        System.out.println("Como o pagamento será realizado?\n1-Boleto 2-Cartão de Crédito: ");
        verifica = in.nextInt();
        if(verifica == 1)   pag.boleto(true);

        else if(verifica == 2)  pag.credito(true);

        return false;

    }
    public boolean Plano3(){
        int verifica = 0;
        System.out.println("Como o pagamento será realizado?\n1-Boleto 2-Cartão de Crédito: ");
        verifica = in.nextInt();
        if(verifica == 1)   pag.boleto(true);

        else if(verifica == 2)  pag.credito(true);

        return false;
    }*/
}