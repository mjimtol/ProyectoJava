/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alta;

import static ConnectionString.Connect.Crear_conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * @author Usuario
 */
public class Alta {        
    
    public static String darAlta(int id)
    {        
        try
        {
            Connection conexion = Crear_conexion();
            
            Statement comando = conexion.createStatement();
            
            comando.executeUpdate("insert into reservas (Id_evento) values ('" + id + "')");
            conexion.close();   
            return "Datos introducidos correctamente";
        } 
        catch(SQLException ex){
            return ex.toString();
        } 
    }
}


