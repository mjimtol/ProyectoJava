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

import static ConnectionString.Connect.Crear_conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class ConsultaDetalles {
   public static LinkedList<detalles> getDetalles(int id)
   {       
      LinkedList<detalles> listaEventos = new LinkedList<detalles>();
      try
      { 
         Connection conexion = Crear_conexion();
         if (conexion != null)
         {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select Id_evento, Nombre, e.Descripcion, Ubicacion, Fecha_ini, Fecha_fin,hora, t.Descripcion"
                    + " from eventos as e inner join tipos as t on e.Tipo = t.Id_tipo where Id_evento =" + id + " order by 1");        
            
            while (rs.next())
            {
               detalles evento = new detalles();
               evento.setId_evento(rs.getInt("Id_evento"));
               evento.setNombre(rs.getString("Nombre"));
               evento.setDescripcion(rs.getString("e.Descripcion"));
               evento.setUbicacion(rs.getString("Ubicacion"));
               evento.setFecha_ini(rs.getString("Fecha_ini"));
               evento.setFecha_fin(rs.getString("Fecha_fin"));
               evento.setHora(rs.getString("hora"));
               evento.setTipo(rs.getString("t.Descripcion"));
               listaEventos.add(evento);
            }
            rs.close();
            st.close();
            conexion.close();
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaEventos;
   }
}