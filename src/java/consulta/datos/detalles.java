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
public class detalles {
    int Id_evento;
    String Nombre;
    String Descripcion;
    String Ubicacion;
    String Fecha_ini;
    String Fecha_fin;
    String hora;
    
    String Tipo ;

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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getFecha_ini() {
        return Fecha_ini;
    }

    public void setFecha_ini(String Fecha_ini) {
        this.Fecha_ini = Fecha_ini;
    }

    public String getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(String Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
