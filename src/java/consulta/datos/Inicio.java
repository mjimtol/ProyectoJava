/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consulta.datos;

/**
 *
 * @author Usuario
 */
public class Inicio {
    int Id_evento;
    String Nombre;
    String Tipo;

    public int getId_evento() {
        return Id_evento;
    }

    public void setId_evento(int Id_evento) {
        this.Id_evento = Id_evento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
