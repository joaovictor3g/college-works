


public class Maquinas_Musculacao{
    private String nome;
    private int id;

    public Maquinas_Musculacao(String nome_, int id_){
        this.nome = nome_;
        this.id = id_;

    }
    public Maquinas_Musculacao(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void malhandoAgora(){
        System.out.println("malhando");
    }
    
}
