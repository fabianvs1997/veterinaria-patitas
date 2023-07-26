<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Veterinario</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <!-- CSS de Bootstrap -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1>Editar Veterinario</h1>
    <form action="veterinarios/update/${vet.id}" method="post">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" value="${vet.nombre}"><br>
        <label for="apellidoPaterno">Apellido Paterno:</label><br>
        <input type="text" id="apellidoPaterno" name="apellidoPaterno" value="${vet.apellidoPaterno}"><br>
        <label for="apellidoMaterno">Apellido Materno:</label><br>
        <input type="text" id="apellidoMaterno" name="apellidoMaterno" value="${vet.apellidoMaterno}"><br>
        <label for="cedulaProfesional">Cedula Profesional:</label><br>
        <input type="text" id="cedulaProfesional" name="cedulaProfesional" value="${vet.cedulaProfesional}"><br>
        <input type="submit" value="Guardar">
    </form>

      <!-- JS de Bootstrap y jQuery (necesario para los componentes de Bootstrap basados en JavaScript) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
