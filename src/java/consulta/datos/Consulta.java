/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consulta.datos;

import static ConnectionString.Connect.Crear_conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;

public class Consulta {
   public static LinkedList<Inicio> getEventos(int i)
   {
      LinkedList<Inicio> listaEventos = new LinkedList<Inicio>();
      try
      { 
         Connection conexion = Crear_conexion();
         if (conexion != null)
         {
            ResultSet rs;
            Statement st = conexion.createStatement();
            if (i!=0)
                rs = st.executeQuery("SELECT Id_evento, Id_tipo, Nombre, t.Descripcion FROM eventos AS e INNER JOIN tipos AS t ON e.Tipo = t.Id_tipo where Id_tipo = " + i + " order by 1");
            else
                rs = st.executeQuery("SELECT Id_evento, Id_tipo, Nombre, t.Descripcion FROM eventos AS e INNER JOIN tipos AS t ON e.Tipo = t.Id_tipo order by 1");
            
            while (rs.next())
            {
               Inicio evento = new Inicio();
               evento.setId_evento(rs.getInt("Id_evento"));
               evento.setNombre(rs.getString("Nombre"));
               evento.setTipo(rs.getString("Descripcion"));
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
