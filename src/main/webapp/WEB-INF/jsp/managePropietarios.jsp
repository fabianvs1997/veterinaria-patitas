<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Administrar Propietarios</title>

    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
        <a class="navbar-brand" href="#">Administrar Propietarios</a>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Volver al menú principal</a>
                </li>
                <li class="nav-item">
                    <button id="showFormBtn" class="btn btn-primary" data-toggle="modal" data-target="#addFormModal">Agregar nuevo propietario</button>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Modal -->
    <div class="modal fade" id="addFormModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Agregar nuevo propietario</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form id="addForm" action="propietarios/addPropietario" method="post" class="p-4">
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="nombre">Nombre:</label>
                            <input type="text" class="form-control" id="nombre" name="nombre">
                        </div>
                        <div class="form-group">
                            <label for="apellidoPaterno">Apellido Paterno:</label>
                            <input type="text" class="form-control" id="apellidoPaterno" name="apellidoPaterno">
                        </div>
                        <div class="form-group">
                            <label for="apellidoMaterno">Apellido Materno:</label>
                            <input type="text" class="form-control" id="apellidoMaterno" name="apellidoMaterno">
                        </div>
                        <div class="form-group">
                            <label for="telefono">Teléfono:</label>
                            <input type="text" class="form-control" id="telefono" name="telefono">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                        <button type="submit" class="btn btn-primary">Agregar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <h2 class="mb-4">Propietarios Existentes</h2>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Teléfono</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="propietario" items="${propietarios}">
            <tr>
                <td>${propietario.nombre}</td>
                <td>${propietario.apellidoPaterno}</td>
                <td>${propietario.apellidoMaterno}</td>
                <td>${propietario.telefono}</td>
                <td>
                    <a class="btn btn-info btn-sm" href="propietarios/editPropietario/${propietario.id}">Editar</a>
                    <a class="btn btn-danger btn-sm" href="propietarios/deletePropietario/${propietario.id}">Eliminar</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

