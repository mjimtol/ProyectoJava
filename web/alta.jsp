<%-- 
    Document   : detalles
    Created on : 17-feb-2014, 17:56:48
    Author     : Usuario
--%>
<%@page import = "alta.Alta"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
          <%
              //Llamada a funcion alta pasando id
            int id = Integer.parseInt(request.getParameter("id"));
            Alta alt = new Alta();
            String resul = alt.darAlta(id);  
            out.println(resul);
            
          %>            
            
    </body>
</html>
