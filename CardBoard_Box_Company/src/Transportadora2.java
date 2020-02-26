
public class Transportadora2 extends Transportadora {

 public String nome;
 public int aereo,terrestre;
 
    public Transportadora2()
    {
        nome = "Transportadora2";
        tempo_min_aereo= 0.30;
        tempo_min_terrestre= 0.59;
        tipo_transporte="Terrestre";
        aereo=200;
        terrestre=75;
    }
    
    public Transportadora2(double tempo_min_aereo,double tempo_min_terrestre,String tipo_transporte, String nome)
    {
    
        super(tempo_min_aereo,tempo_min_terrestre,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora2 (Transportadora2 t2)
        {
        this(t2.tempo_min_aereo,t2.tempo_min_terrestre,t2.tipo_transporte,t2.nome);
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
