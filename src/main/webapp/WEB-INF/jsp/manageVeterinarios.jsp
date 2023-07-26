<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Administrar Veterinarios</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <!-- CSS de Bootstrap -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>

<body >
    <h1>Administrar Veterinarios</h1>
    <h2>Agregar Veterinario</h2>

    <button id="showFormBtn">Agregar nuevo veterinario</button>
    <form id="addVeterinarioForm" style="display: none;" action="veterinarios/addVeterinario" method="post">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre"><br>
        <label for="apellidoPaterno">Apellido Paterno:</label><br>
        <input type="text" id="apellidoPaterno" name="apellidoPaterno"><br>
        <label for="apellidoMaterno">Apellido Materno:</label><br>
        <input type="text" id="apellidoMaterno" name="apellidoMaterno"><br>
        <label for="cedulaProfesional">Cédula Profesional:</label><br>
        <input type="text" id="cedulaProfesional" name="cedulaProfesional"><br>
        <input type="submit" value="Agregar">
    </form>
    <h2>Veterinarios Existentes</h2>
    <table>
        <tr>
            <th>Nombre</th>
            <th>Apellido Paterno</th>
            <th>Apellido Materno</th>
            <th>Cédula Profesional</th>
            <th>Acciones</th>
        </tr>
        <c:forEach var="vet" items="${veterinarios}">
        <tr>
            <td>${vet.nombre}</td>
            <td>${vet.apellidoPaterno}</td>
            <td>${vet.apellidoMaterno}</td>
            <td>${vet.cedulaProfesional}</td>
            <td>
                <a href="veterinarios/editVeterinario/${vet.id}">Editar</a> |
                <a href="veterinarios/deleteVeterinario/${vet.id}">Eliminar</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    <script>
        document.getElementById('showFormBtn').addEventListener('click', function() {
            document.getElementById('addVeterinarioForm').style.display = 'block';
        });
    </script>
    <!-- JS de Bootstrap y jQuery (necesario para los componentes de Bootstrap basados en JavaScript) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
