
package cl.duoc.interauto.modelos;



public class Moto extends Vehiculo{
    private String Cilindrada;

    public Moto(String Cilindrada, String Marca, String Modelo, String Color, String Patente) {
        super(Marca, Modelo, Color, Patente);
        this.Cilindrada = Cilindrada;
    }

    public Moto(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    public Moto() {
        super();
        this.Cilindrada = "";
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    @Override
    public String Suena(){
        return "RAAAAMAAMAAMAMAAAAANNNNNN!!";
    }
    
            
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
            
        sb.append("\n Marca: ").append(super.getMarca());
        sb.append("\n Modelo: ").append(super.getModelo());
        sb.append("\n Color: ").append(super.getColor());
        sb.append("\n Patente: ").append(super.getPatente());
        sb.append("\n Cilindrada: ").append(this.getCilindrada());
        sb.append("\n Suena como: ").append(this.Suena());
        
        
        return sb.toString();
            
    
    }


 

        
    
    
    

}
    