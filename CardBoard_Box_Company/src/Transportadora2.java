
public class Transportadora2 extends Transportadora {

 public String nome;
    
    public Transportadora2()
    {
        
    }
    
    public Transportadora2(int valor_por_km,int tempo_min,String tipo_transporte, String nome)
    {
    
        super(valor_por_km,tempo_min,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora2 (Transportadora2 t2)
        {
        this(t2.valor_por_km,t2.tempo_min,t2.tipo_transporte,t2.nome);
        }
    
}
