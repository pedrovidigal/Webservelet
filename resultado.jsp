<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    <p>N�mero 1: <%= request.getAttribute("numero1") %></p>
    <p>N�mero 2: <%= request.getAttribute("numero2") %></p>
    <p>Soma: <%= request.getAttribute("soma") %></p>
    <p>Subtra��o: <%= request.getAttribute("subtracao") %></p>
    <p>Multiplica��o: <%= request.getAttribute("multiplicacao") %></p>
    <p>Divis�o: <%= request.getAttribute("divisao") %></p>
    <p>Resto: <%= request.getAttribute("resto") %></p>
</body>
</html>
