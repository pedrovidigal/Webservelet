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
    <p>Número 1: <%= request.getAttribute("numero1") %></p>
    <p>Número 2: <%= request.getAttribute("numero2") %></p>
    <p>Soma: <%= request.getAttribute("soma") %></p>
    <p>Subtração: <%= request.getAttribute("subtracao") %></p>
    <p>Multiplicação: <%= request.getAttribute("multiplicacao") %></p>
    <p>Divisão: <%= request.getAttribute("divisao") %></p>
    <p>Resto: <%= request.getAttribute("resto") %></p>
</body>
</html>
