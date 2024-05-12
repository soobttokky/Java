<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Resultado da Média</title>
</head>
<body>
    <h1>Resultado da Média</h1>
    <% 
        // Obter notas do formulário
        double nota1 = Double.parseDouble(request.getParameter("nota1"));
        double nota2 = Double.parseDouble(request.getParameter("nota2"));
        
        // Calcular média
        double media = (nota1 + nota2) / 2.0;
    %>
    <p>A média das notas <%= nota1 %> e <%= nota2 %> é: <%= media %></p>
</body>
</html>
