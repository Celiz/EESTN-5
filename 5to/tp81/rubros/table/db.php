<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Alta</title>
</head>

<body>
  <?php
  $mysql = new mysqli("localhost", "root", "", "base1poo");
  if ($mysql->connect_error)
    die('Problemas con la conexion a la base de datos');

  $mysql->query("insert into rubros(descripcion) values ('$_REQUEST[descripcion]')") or
    die($mysql->error);

  $mysql->close();

  echo 'El nuevo rubro se almacenó';
  ?>
  <br>
</body>

</html>