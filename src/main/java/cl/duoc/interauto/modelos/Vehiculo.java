
package cl.duoc.interauto.modelos;


public abstract class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Color;
    private String Patente;

    public Vehiculo(String Marca, String Modelo, String Color, String Patente) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Patente = Patente;
    }
    
     public Vehiculo() {
        this.Marca = "";
        this.Modelo = "";
        this.Color = "";
        this.Patente = "";
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }
    
    public abstract String Suena();
}