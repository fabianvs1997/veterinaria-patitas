<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Propietario</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
       <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Editar Propietario</h1>
    <form action="propietarios/updatePropietario/${propietario.id}" method="post">
        <input type="hidden" id="id" name="id" value="${propietario.id}">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" value="${propietario.nombre}"><br>
        <label for="apellidoPaterno">Apellido Paterno:</label><br>
        <input type="text" id="apellidoPaterno" name="apellidoPaterno" value="${propietario.apellidoPaterno}"><br>
        <label for="apellidoMaterno">Apellido Materno:</label><br>
        <input type="text" id="apellidoMaterno" name="apellidoMaterno" value="${propietario.apellidoMaterno}"><br>
        <label for="telefono">Teléfono:</label><br>
        <input type="text" id="telefono" name="telefono" value="${propietario.telefono}"><br>
        <input type="submit" value="Actualizar">
    </form>
</body>
</html>
