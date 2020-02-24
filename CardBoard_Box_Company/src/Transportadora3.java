
public class Transportadora3 extends Transportadora{
    
     public String nome;
    
    public Transportadora3()
    {
        
    }
    
    public Transportadora3(int valor_por_km,int tempo_min,String tipo_transporte, String nome)
    {
    
        super(valor_por_km,tempo_min,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora3 (Transportadora3 t3)
        {
        this(t3.valor_por_km,t3.tempo_min,t3.tipo_transporte,t3.nome);
        }
}
