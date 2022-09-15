<!doctype html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Modificación de rubro.</title>
</head>

<body>

  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die("Problemas con la conexión a la base de datos");

  $mysql->query("update rubros set descripcion='$_REQUEST[descripcion]' 
                          where codigo=$_REQUEST[codigo]") or
    die($mysql->error);

  echo 'Se modificó la descripción del rubro';

  $mysql->close();

  ?>
</body>

</html>