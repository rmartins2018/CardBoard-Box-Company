
public class Transportadora4 extends Transportadora{
    
     public String nome;
    
    public Transportadora4()
    {
        
    }
    
    public Transportadora4(int valor_por_km,int tempo_min,String tipo_transporte, String nome)
    {
    
        super(valor_por_km,tempo_min,tipo_transporte);
        this.nome=nome;
    }
    
        public Transportadora4 (Transportadora4 t4)
        {
        this(t4.valor_por_km,t4.tempo_min,t4.tipo_transporte,t4.nome);
        }
    
}
