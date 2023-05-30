<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

<head>
    <!-- METADATA -->
    <!-- charset para caracteres especiales -->
    <meta charset="UTF-8" />
    <!-- autor -->
    <meta name="author" content="Johan Alexander Varon Varon" />
    <!-- description -->
    <meta name="description" content="Formulario de registro de usuarios en Java Web Jakarta. Ingresa información personal y comienza a disfrutar de nuestros servicios con seguridad garantizada." />
    <!-- keywords -->
    <meta name="keywords" content="registro de usuarto, formulario de registro, crear cuenta, registro en línea" />
    <!-- minium responsive viewport -->
    <meta name="viewport " content="width=device-width, initial-scale=1.0 " />
    <!-- TITLE -->
    <title>Registro de Usuario || My App Form</title>
    <!-- FAVICON -->
    <link rel="icon" href="img/descarga.png" type="image/x-icon" />
    <!-- CSS -->
    <!-- bootstrap css / icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
    <!-- custom CSS -->
    <link rel="stylesheet" href="css/signin.css">
</head>

<body class="text-center">
<!-- login form -->
<main class="form-signin w-100 m-auto">
    <form action="" method="post">
        <img class="" src="img/descarga.png" alt="My App Form" width="100">
        <h4 class="text-secondary">My App 0</h4>
        <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput"
                   placeholder="ingrese su nombre de usuario"
                   required autofocus pattern="[A-Za-z0-9]{8, 12}">
            <label for="floatingInput">Usuario:</label>
        </div>

        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword"
                   placeholder="ingrese su contraseña"
                   required pattern="[A-Za-z0-9]{8, 12}">
            <label for="floatingPassword">Contraseña:</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Ingresar</button>
        <div id="register">
            <a href="#">Registrarse</a>
        </div>
        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados -Johan_varon
            <!-- <%=displayDate()%> -->
        </p>

    </form>

</main>
<!-- Bootstrap script-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<!--
        <%!
            public String displayDate() {
                SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
                Date date = Calendar.getInstance().getTime();
                return dateFormat.format(date);
            }
        %>
    -->
</body>

</html>