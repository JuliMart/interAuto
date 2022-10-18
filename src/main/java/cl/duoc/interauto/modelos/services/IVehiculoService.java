
package cl.duoc.interauto.modelos.services;

import cl.duoc.interauto.modelos.Camion;
import java.util.ArrayList;


public interface IVehiculoService {
    public void Crear (Camion ca);
    public void Reemplazar (int indice, Camion ca);
    public void Eliminar (Camion ca);
    public ArrayList<Camion> ObtenerTodo();
    public Camion Obtener (int Indice);
    public void Imprimir();
    
    
    
    
}
