
public class Transportadora1 extends Transportadora {
    
     public String nome;
     public int terrestre;
    public Transportadora1()
    {
        nome = "Transportadora1";
        tempo_min_aereo=0;
        tempo_min_terrestre= 0.60;
        tipo_transporte="Terrestre";
        terrestre = 50;
    }
    
    public Transportadora1(double tempo_min_aereo,double tempo_min_terrestre,String tipo_transporte, String nome)
    {
    
        super(tempo_min_aereo,tempo_min_terrestre,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora1 (Transportadora1 t1)
        {
        this(t1.tempo_min_aereo,t1.tempo_min_terrestre,t1.tipo_transporte,t1.nome);
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



