
public class Transportadora3 extends Transportadora{
    
     public String nome;
    public int aereo,terrestre;
    public Transportadora3()
    {
        nome = "Transportadora3";
        tempo_min_aereo= 0.33;
        tempo_min_terrestre= 0.65;
        tipo_transporte="Terrestre";
        aereo=180;
        terrestre=55; 
    }
    
    public Transportadora3(double tempo_min_aereo,double tempo_min_terrestre,String tipo_transporte, String nome)
    {
    
        super(tempo_min_aereo,tempo_min_terrestre,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora3 (Transportadora3 t3)
        {
        this(t3.tempo_min_aereo,t3.tempo_min_terrestre,t3.tipo_transporte,t3.nome);
        }
        
           public void setNome(String nome)
    {
    this.nome=nome;
    }
    public String getNome()
    {
    
    return nome;
    
    }
   
}
