

package cl.duoc.interauto;

import cl.duoc.interauto.modelos.Auto;
import cl.duoc.interauto.modelos.Camion;
import cl.duoc.interauto.modelos.Moto;



public class InterAuto {

    public static void main(String[] args) {
      Auto a = new Auto();
      
      a.setMarca("Renault");
      a.setModelo("12");
      a.setColor("Gris");
      a.setPatente("xxdd20");
      a.setTipo("SUV");
      a.setTraccion("4x4");
      
    
        
      Moto mo = new Moto();
      
      mo.setMarca("Garelli");
      mo.setModelo("Ninja");
      mo.setColor("Verde");
      mo.setPatente("BSDS12");
      mo.setCilindrada("50cc");
      
      Camion ca = new Camion();
      
      ca.setMarca("Mercedito");
      ca.setModelo("1114");
      ca.setColor("Rojo faia");
      ca.setPatente("XFGD43");
      ca.setTonelaje(30);
      
        System.out.println(ca);
        System.out.println(mo);
        System.out.println(a);
    }
}
