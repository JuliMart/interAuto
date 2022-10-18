
package cl.duoc.interauto.modelos.services;

import cl.duoc.interauto.modelos.Camion;
import java.util.ArrayList;


public class VehiculoService implements IVehiculoService{
    ArrayList<Camion> ListaCamion = new ArrayList();
    @Override
    public void Crear(Camion ca) {
        ListaCamion.add(ca);
        
    }

    @Override
    public void Reemplazar(int indice, Camion ca) {
        ListaCamion.set(indice, ca);
    }

    @Override
    public void Eliminar(Camion ca) {
        ListaCamion.remove(ca);
    }

    @Override
    public ArrayList<Camion> ObtenerTodo() {
        return ListaCamion;
    }

    @Override
    public Camion Obtener(int Indice) {
        return ListaCamion.get(Indice);
    }

    @Override
    public void Imprimir() {
        for (Camion ca : ListaCamion){
            System.out.println(ca);
        }
            
    }
    
    
}
