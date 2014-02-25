
<%-- 
    Document   : detalles
    Created on : 17-feb-2014, 17:56:48
    Author     : Usuario
--%>
<%@page import = "consulta.datos.ConsultaDetalles"%>
<%@page import = "consulta.datos.detalles"%>
<%@page import = "consulta.datos.MostrarImagen"%> 
<%@page import = "java.util.LinkedList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css" type="text/css"/>
    </head>
    <body>       
          <%           
            int id = Integer.parseInt(request.getParameter("id"));
            
            out.println("<img src='"+request.getContextPath()+"/MostrarImagen?id="+id+"'><br>");
            
            LinkedList<detalles> lista = ConsultaDetalles.getDetalles(id);
            for (int i=0;i<lista.size();i++)
            {
               out.println("<h1><b>");
               //out.println(lista.get(i).getId_evento()+". ");
               out.println(lista.get(i).getNombre() + "</b></h1><br>");
               out.println(lista.get(i).getDescripcion());   
               out.println("<br>");
               out.println(lista.get(i).getUbicacion()); 
               out.println("<br>");

               out.println(lista.get(i).getFecha_ini()); 
               if (!lista.get(i).getFecha_ini().equals(lista.get(i).getFecha_fin()))     
               { out.println(" a " + lista.get(i).getFecha_fin()); }
               out.println("<br>");
               out.println(lista.get(i).getHora());    
               out.println("<br>");
               out.println(lista.get(i).getTipo());    
            }
            
            out.println("<form action='alta.jsp' method='POST'>");
            out.println("<input type='hidden' name='id' value='"+request.getParameter("id")+"'>");
            %>            
            
            <br><input type="submit" value="Hacer Reserva">
            </form>
            <a href ="index.jsp">Volver...</a>
    </body>
</html>
