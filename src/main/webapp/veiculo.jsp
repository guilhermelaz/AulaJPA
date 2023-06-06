<%@ page import="com.example.aulajpa.domain.entities.Veiculo" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<Veiculo> veiculos = (List<Veiculo>) request.getAttribute("attr_veiculos");
%>

<html>
<head>
    <title></title>
</head>
<body>

    <% for (Veiculo v : veiculos) {%>
        <p> <%= v.getModelo() %> </p>
    <% } %>

</body>
</html>
