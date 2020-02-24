
public abstract class Transportadora {
    
    public int valor_por_km, tempo_min;
    public String tipo_transporte;
        


public Transportadora()
{

}

public Transportadora(int valor_por_km,int tempo_min,String tipo_transporte)
{
this.valor_por_km = valor_por_km;
this.tempo_min = tempo_min;
this.tipo_transporte = tipo_transporte;


}

public Transportadora (Transportadora t)
{
    
this(t.valor_por_km,t.tempo_min,t.tipo_transporte);

}
}