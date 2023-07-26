<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Propietario</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container">
    <h1 class="mt-4">Editar Propietario</h1>
    <form action="propietarios/updatePropietario/${propietario.id}" method="post" class="mt-4">
        <input type="hidden" id="id" name="id" value="${propietario.id}">
        <div class="form-group">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" class="form-control" value="${propietario.nombre}">
        </div>
        <div class="form-group">
            <label for="apellidoPaterno">Apellido Paterno:</label>
            <input type="text" id="apellidoPaterno" name="apellidoPaterno" class="form-control" value="${propietario.apellidoPaterno}">
        </div>
        <div class="form-group">
            <label for="apellidoMaterno">Apellido Materno:</label>
            <input type="text" id="apellidoMaterno" name="apellidoMaterno" class="form-control" value="${propietario.apellidoMaterno}">
        </div>
        <div class="form-group">
            <label for="telefono">Teléfono:</label>
            <input type="text" id="telefono" name="telefono" class="form-control" value="${propietario.telefono}">
        </div>
        <div style="display: flex; justify-content: space-between;">
            <input type="submit" value="Actualizar" class="btn btn-primary">
            <a href="/propietarios" class="btn btn-danger">Cancelar</a>
        </div>
    </form>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

