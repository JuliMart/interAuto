
package cl.duoc.interauto.modelos;


public class Auto extends Vehiculo{
    private String Traccion;
    private String Tipo;

    public Auto(String Traccion, String Tipo, String Marca, String Modelo, String Color, String Patente) {
        super(Marca, Modelo, Color, Patente);
        this.Traccion = Traccion;
        this.Tipo = Tipo;
    }

    public Auto() {
        super();
        this.Traccion = "";
        this.Tipo = "";
    }

    public String getTraccion() {
        return Traccion;
    }

    public void setTraccion(String Traccion) {
        this.Traccion = Traccion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n Marca: ").append(super.getMarca());
        sb.append("\n Modelo: ").append(super.getModelo());
        sb.append("\n Color: ").append(super.getColor());
        sb.append("\n Tracción: ").append(this.getTraccion());
        sb.append("\n Tipo: ").append(this.getTipo());
        sb.append("\n Suena como: ").append(this.Suena());
        
        return sb.toString();
        
        
        
    }

    @Override
    public String Suena() {
        return "ROOMOOMOOMOOOOONNNN";
    }
    
}
