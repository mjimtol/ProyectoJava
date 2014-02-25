
<%@ page language="java"%>
<%@ page import = "consulta.datos.Consulta"%> 
<%@ page import = "consulta.datos.Inicio"%> 
<%@ page import = "java.util.LinkedList"%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="css/estilos.css" type="text/css"/>
    </head>
    <body>        
        <div class="contenedor">
            <!-- Filtro por tipo de evento -->
           <form action="index.jsp" method="POST">
                <select name="STipo">
                    <option value="0">Todos</option>
                    <option value="1">Teatro</option>
                    <option value="2">Conciertos</option>
                    <option value="3">Deportes</option>
                    <option value="4">Otros</option>
                </select>
                <input type="submit" value="Filtrar">
            </form> 
            
            <%
            LinkedList<Inicio> lista;
            String tipo = request.getParameter("STipo"); //Recoge el tipo de evento para hacer la consulta
            if (tipo == null)
                lista = Consulta.getEventos(0); //Llama a la función donde hace la consulta
            else
                lista = Consulta.getEventos(Integer.parseInt(tipo));
            //Muestra los datos de la consulta
            for (int i=0;i<lista.size();i++)
            {
               out.println("<br>");
               out.println("<a href='detalles.jsp?id="+ lista.get(i).getId_evento()+"'>");
               out.println("<article>");
               out.println("<b>" + (i+1) +". ");
               out.println(lista.get(i).getNombre() + "</b><br>");
               out.println(lista.get(i).getTipo());
               out.println("</article>");   
               out.println("</a>");
            }
            %>
        </div>
    </body>
</html>
