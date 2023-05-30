<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de usuario</title>
    <!-- CSS de Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-UeZfTFz/..." crossorigin="anonymous">
</head>
<body>
<div class="container-lg mt-5">
    <h1 class="mb-4">User register</h1>
    <form>
        <div class="mb-3">
            <label for="nombres" class="form-label">Nombre:</label>
            <input type="text" name="nombres" id="nombres" class="form-control" required
                   placeholder="Ingrese su nombre" autofocus
                   pattern="[A-Za-z]{2,40}">
        </div>
        <div class="mb-3">
            <label for="apellidos" class="form-label">Apellido:</label>
            <input type="text" name="apellidos" id="apellidos" class="form-control"
                   placeholder="Ingrese su apellido" required autofocus
                   pattern="[A-Za-z]{2,40}">
        </div>
        <div class="mb-3">
            <label for="correo" class="form-label">Gmail:</label>
            <input type="email" name="correo" id="correo" class="form-control" required
                   placeholder="Ingrese su Gmail.com" required autofocus
                   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Contraseña:</label>
            <input type="password" name="password" id="password" class="form-control" required
                   placeholder="Ingrese una contraseña" required autofocus>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</div>
<!-- JS de Bootstrap 5 (requiere jQuery) -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha384-HyQk073g6I3KHpF17MkIs5R4Fal+GsKkKv/rG+8WPGs7JqMh/hoPzQ8..." crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qzP/9XbQ2N1FoyY8t+/TkP..." crossorigin="anonymous"></script>
</body>
</html>
