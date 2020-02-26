
public abstract class Transportadora {
    
    public double tempo_min_aereo,tempo_min_terrestre;
    public String tipo_transporte; 


public Transportadora()
{

}

public Transportadora(double tempo_min_aereo,double tempo_min_terrestre,String tipo_transporte)
{

this.tempo_min_aereo = tempo_min_aereo;
this.tempo_min_terrestre = tempo_min_terrestre;
this.tipo_transporte = tipo_transporte;

}

public Transportadora (Transportadora t)
{
    
this(t.tempo_min_aereo,t.tempo_min_terrestre,t.tipo_transporte);

}
}