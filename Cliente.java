import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Date;


class Cliente extends Pessoa{
    Cliente codigo;
    private Date data_nasc;
    Endereco endereco = new Endereco();
    private ArrayList<Maquinas_Musculacao> maquinas = new ArrayList<>();
    private int mes_ultimo_pagamento;   
   
    public Cliente(String nome_, String cpf_, int matricula){
        this.setNome(nome_);
        this.setCpf(cpf_);
        this.setCodigo(matricula);

    }
    public Cliente(){

    }
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " CPF: "+ this.getCpf() +" Matrícula: " + this.getCodigo();

    }
    

}