<%-- 
    Document   : index
    Created on : 7 sept 2022, 13:14:08
    Author     : administradorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorio</title>          
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">               
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>     
        <nav class="navbar" >
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="img/logo.webp  " alt="Logo" width="60" height="60" class="d-inline-block align-text-center color-text-light">
                    LABORATORIO
                </a>
            </div>
        </nav>
        <div class="container text-center">
            <div class="row align-items-center">             
                <div class="col">                                     
                    <form class="row g-3"action="Control" method="get">
                        <div class="mb-3">
                            <label>Nombre</label>
                            <input type="text"  class="form-control" name="txt_nombres" required >
                        </div>
                        <div class="mb-3">
                            <label>Telefono</label>
                            <input type="text" class="form-control" name="txt_telefono" required>
                        </div>
                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" class="form-control" name="txt_email" required>
                        </div>
                        <div class="mb-3">
                            <label>Contraseña</label>
                            <input type="password" class="form-control" name="txt_clave" required>
                        </div>
                        <div class="mb-3">
                            <button type="submit" class="btn btn-outline-dark btn-lg" name="btn_registrar">registrar</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>


        <footer>
            <p>Brandon Celeita - Prog. Componentes - 2022</p>
        </footer>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>

</html>
