<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-4">
    <div class="row">
        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-header">Citas</div>
                <div class="card-body">
                    <h5 class="card-title">Total de citas</h5>
                    <p class="card-text">Aquí puedes agregar el número total de citas.</p>
                    <a href="citas" class="btn btn-primary">Ver citas</a>
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-header">Pacientes</div>
                <div class="card-body">
                    <h5 class="card-title">Total de pacientes</h5>
                    <p class="card-text">Aquí puedes agregar el número total de pacientes.</p>
                    <a href="pacientes" class="btn btn-primary">Ver pacientes</a>
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-header">Propietarios</div>
                <div class="card-body">
                    <h5 class="card-title">Total de propietarios</h5>
                    <p class="card-text">Aquí puedes agregar el número total de propietarios.</p>
                    <a href="propietarios" class="btn btn-primary">Ver propietarios</a>
                </div>
            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-header">Veterinarios</div>
                <div class="card-body">
                    <h5 class="card-title">Total de veterinarios</h5>
                    <p class="card-text">Aquí puedes agregar el número total de veterinarios.</p>
                    <a href="veterinarios" class="btn btn-primary">Ver veterinarios</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
