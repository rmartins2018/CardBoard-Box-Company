
public class Transportadora1 extends Transportadora {
    
     public String nome;
    
    public Transportadora1()
    {
        
    }
    
    public Transportadora1(int valor_por_km,int tempo_min,String tipo_transporte, String nome)
    {
    
        super(valor_por_km,tempo_min,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora1 (Transportadora1 t1)
        {
        this(t1.valor_por_km,t1.tempo_min,t1.tipo_transporte,t1.nome);
        }
    
    }

