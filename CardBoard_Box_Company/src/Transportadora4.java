
public class Transportadora4 extends Transportadora{
    
     public String nome;
    public int aereo;
    public Transportadora4()
    {
        nome = "Transportadora1";
        tempo_min_aereo=0.30;
        tempo_min_terrestre= 0;
        tipo_transporte="Terrestre";
        aereo = 175;
    }
    
    public Transportadora4(double tempo_min_aereo,double tempo_min_terrestre,String tipo_transporte, String nome)
    {
    
        super(tempo_min_aereo,tempo_min_terrestre,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora4 (Transportadora4 t4)
        {
        this(t4.tempo_min_aereo,t4.tempo_min_terrestre,t4.tipo_transporte,t4.nome);
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
