
package cl.duoc.interauto.modelos;


public class Camion extends Vehiculo{
    private int Tonelaje;

    public Camion(int Tonelaje, String Marca, String Modelo, String Color, String Patente) {
        super(Marca, Modelo, Color, Patente);
        this.Tonelaje = Tonelaje;
    }

    public Camion(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }
    
    public Camion(){
        super();
        this.Tonelaje = 0;
    }

    public int getTonelaje() {
        return Tonelaje;
    }

    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }

    @Override
    public String Suena() {
        return "MIEEEEEEEEEEEEEENNNNN";
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
            
        sb.append("\n Marca: ").append(super.getMarca());
        sb.append("\n Modelo: ").append(super.getModelo());
        sb.append("\n Color: ").append(super.getColor());
        sb.append("\n Patente: ").append(super.getPatente());
        sb.append("\n Tonelaje: ").append(this.getTonelaje());
        sb.append("\n Suena como: ").append(this.Suena());
        
        
        return sb.toString();
    }
}
