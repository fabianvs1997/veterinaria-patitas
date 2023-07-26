<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Administrar Propietarios</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
       <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Administrar Propietarios</h1>
    <h2>Agregar Propietario</h2>
    <form action="propietarios/addPropietario" method="post">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre"><br>
        <label for="apellidoPaterno">Apellido Paterno:</label><br>
        <input type="text" id="apellidoPaterno" name="apellidoPaterno"><br>
        <label for="apellidoMaterno">Apellido Materno:</label><br>
        <input type="text" id="apellidoMaterno" name="apellidoMaterno"><br>
        <label for="telefono">Teléfono:</label><br>
        <input type="text" id="telefono" name="telefono"><br>
        <input type="submit" value="Agregar">
    </form>
    <h2>Propietarios Existentes</h2>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Apellido Paterno</th>
            <th>Apellido Materno</th>
            <th>Teléfono</th>
            <th>Acciones</th>
        </tr>
        <c:forEach var="propietario" items="${propietarios}">
        <tr>
            <td>${propietario.nombre}</td>
            <td>${propietario.apellidoPaterno}</td>
            <td>${propietario.apellidoMaterno}</td>
            <td>${propietario.telefono}</td>
            <td>
                <a href="propietarios/editPropietario/${propietario.id}">Editar</a> |
                <a href="propietarios/deletePropietario/${propietario.id}">Eliminar</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>

