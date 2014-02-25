package ConnectionString;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    
    public static Connection Crear_conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
            return conexion;
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        return null;
    }
}
